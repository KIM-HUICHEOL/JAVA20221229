package Ch17;


public class C02Exception {

	public static void main(String[] args) {
		
		try {
			//int arr[] = new int[3];
			//arr[5] = 10;
			//String str = null;
			//System.out.println(str.hashCode());
			System.out.println(10/0);  //산술오류 ArithmeticException
		}catch(Exception e) {
			System.out.println("예외처리!");
			e.printStackTrace();
		}
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");
		
		
	}

}
