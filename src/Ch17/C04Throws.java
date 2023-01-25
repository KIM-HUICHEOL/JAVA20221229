package Ch17;




public class C04Throws {

	public static void Ex1() {
		try {
		throw new NullPointerException("Ex1의 예외처리!!");  // throw : 예외 의도적으로 발생시킴
		}catch (Exception e) {
			System.out.println("Ex1 예외처리!");
		}
		System.out.println("Ex1 실행코드");
	}
	
	
	public static void Ex2() throws Exception {  
		// throws : 특정 함수에서 예외가 발생할 때 예외를 호출 함수로 넘겨버림
		
		throw new NullPointerException("Ex2의 예외처리!!");
		
	}
	
	
	
	public static void main(String[] args) {
		Ex1();
		
		try {
		Ex2();
		} catch(Exception e) {
			System.out.println("Ex2 실행코드");
		}
	}
}
