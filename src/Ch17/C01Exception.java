package Ch17;

public class C01Exception {

	public static void main(String[] args) {
		
		try {
			//NullPointerException 확인
			String str = null;
			System.out.println(str.toString());
		
		}catch(NullPointerException e) {
			//System.out.println("예외처리완료!");
			//System.out.println(e.getCause());		  //예외원인
			//System.out.println(e.toString());		  //예외객체 설명
			//System.out.println(e.getStackTrace());  //예외정보
			e.printStackTrace();					  
			
		}
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
	}

}
