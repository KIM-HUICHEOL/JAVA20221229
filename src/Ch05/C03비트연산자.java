package Ch05;

public class C03비트연산자 {

	public static void main(String[] args) {
		int num1 = 15;		   // 00000000 00000000 00000000 00001111
		int num2 = 20;
		int num3 = num1&num2;  // 둘 다 true이어야 1
		int num4 = num1|num2;  // 둘 중 하나라도 true여도 1
		int num5 = num1^num2;  // 둘 다 true(1 1) 또는 false(0 0)이면 0
		int num6 = ~num1;      // 1의 보수값(반전비트)
	
		System.out.println("AND 비트 연산 결과 : " + num3);
		System.out.println("OR 비트 연산 결과 : " + num4);
		System.out.println("XOR 비트 연산 결과 : " + num5);
		System.out.println("NOT 비트 연산 결과 : " + num6);
	}

}
