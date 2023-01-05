package Ch05;

public class C04Shift연산자 {

	public static void main(String[] args) {
		int num1 = 15;		    // 00000000 00000000 00000000 00001111
		int num2 = 20;		    // 00000000 00000000 00000000 00010100
		int num3 = num2<<2;     // 00000000 00000000 00000000 01010000, 왼쪽으로 2칸 이동 앞에 2개 0 버려지고 뒤에 2개 0 생성 (20 * 2^2)
		int num4 = num2>>2;  	// 00000000 00000000 00000000 00000101, 오른쪽으로 2칸 이동 (20 * 2^-2)
		
		System.out.println("<<Shift 연산결과 : " + num3);
		System.out.println(">>Shift 연산결과 : " + num4);
	}

}
