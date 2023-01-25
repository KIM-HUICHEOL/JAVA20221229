package Ch17;


public class C03Exception {

	public static void main(String[] args) {
		
		try {  //산술오류 ArithmeticException
			//int arr[] = new int[3];
			//arr[5] = 10;
			//String str = null;
			//System.out.println(str.hashCode());
			System.out.println(10/0); 
		}catch(Exception e) {
			System.out.println("예외처리!");
			e.printStackTrace();
		} finally {
			// 예외가 발생하든/하지않든간에 무조건 실행되는 코드
			System.out.println("실행코드1");
			System.out.println("실행코드2");
		}
		

		
		
	}
}
