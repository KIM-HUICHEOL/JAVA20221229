package Ch02;

public class C04변수자료형 {

	public static void main(String[] args) {
		//----------------------------
		//정수 int-4byte 정수
		//----------------------------
//		int n1 = 0b10101101;  // 2진수값, 0b
//		int n2 = 173;         // 10진정수값
//		int n3 = 0255;        // 8진수, 0
//		int n4 = 0xad;        // 16진수, 0x
//		System.out.printf("%d %d %d %d\n", n1, n2, n3, n4);
		
		//----------------------------
		//정수 byte-1byte 정수 부호 o
		//----------------------------
//		byte n1 = -128;
//		byte n2 = -30;
//		byte n3 = 30;
//		byte n4 = 127;
//		byte n5 = (byte)128;  // 문제발생, byte로 강제연결
//		System.out.printf("%d\n", n5);		
		
		//----------------------------
		//정수 short-2byte 정수 부호 o | char-2byte정수 부호 x(양수만)
		//----------------------------
//		char n1 = 65535;  // (0~2^16-1) (0~65535)
//		short n2 = 32767;  // (-2^15 ~ +2^15-1) (-32768 ~ +32767)
//		
//		char n3 = 60000;
//		short n4 = (short)n3;  // 문제발생, short로 강제연결
//		System.out.printf("%d\n", n4);
		
		//----------------------------
		//정수 long-8byte 정수 부호 o 
		//----------------------------
//		long n1 = 10;
//		long n2 = 20L;  // L, 1(리터럴 접미사) : long 자료형 사용하여 값 저장
//		
//		long n3 = 10000000000;  // 문제발생(int는 약 21억까지 가능)
//		long n4 = 10000000000L;
		
		//----------------------------
		//실수 
		//----------------------------		
		//유리수와 무리수의 통칭
		//소수점 이하 값을 가지는 수 123.456
		//float : 4byte 실수(6~9 자리)
		//double : 8byte 실수(15~18 자리)
		
		//정밀도 확인
//		float n1 = 0.123456789123456789F;  // f, F : float형 접미사
//		double n2 = 0.123456789123456789;
//		
//		System.out.println(n1);
//		System.out.println(n2);
		
		//----------------------------
		//단일문자 char - 2byte 정수 
		//----------------------------
//		char ch1 = 'a';
//		System.out.println(ch1);
//		System.out.println((int)ch1);  // 01100001
//		
//		char ch2 = 98;
//		System.out.println(ch2);
//		System.out.println((int)ch2);  // 01100010
//		
//		char ch3 = 'b'+1;  // 'b'를 98로 해석(ASCII code)
//		System.out.println(ch3);
//		System.out.println((int)ch3);  // 01100011
//		
//		byte ch4 = 'c'+2;  // 단일문자 연산 가능o
//		System.out.println((char)ch4);
//		System.out.println(ch4);  // 01100110
//
//		char ch5 = '가';
//		char ch6 = 0xac00+1;
//		System.out.printf("%c %c\n", ch5, ch6);
//		
//		// \\u : 유니코드값 이스케이프 문자
//		System.out.printf("%c\n", '\uac80');
//		
//		char ch7 = '\ud7fb';
//		System.out.printf("%c\n", ch7);
		
		
		//----------------------------
		//문자열 : String (클래스 자료형) 
		//----------------------------
		
		// 기본 자료형(원시타입)
//		byte n1;  
//		short n2;
//		double n3;
//		long n4;
		
		//클래스자료형
		//클래스자료형으로 만든변수는 '참조변수'라고 하고
		//참조변수는 데이터가 저장된 위치정보(메모리주소값)이 저장된다.
//		int n1 = 10;
//		String name = "홍길동";  // name : 참조변수(값 자체가 들어가지 않고 홍길동의 위치정보가 들어감)
//		String job = "프로그래머";
//		System.out.println(name);
//		System.out.println(job);
		
		//----------------------------
		//boolean : 논리형(true/false 저장)
		//----------------------------
		
//		boolean flag = true;  //참(긍정)
//		if(flag) 
//		{
//			System.out.println("참인경우 실행");			
//		}
//		else
//		{
//			System.out.println("거짓인경우 실행");
//		}
		
		
//  정수 1 : 	byte
//	    2 : short
//      4 : int
//		8 : long
//		
//  실수 2 : float
//      4 : double
//
//  논리 : 1 : boolean 
//		xxoxxoxxxx
		
//		int v2 = 1e2;
//		System.out.println(1e2);  // (1e2 : 1 * 10^2)
//		System.out.println(1e-2);  // (1e-2 : 1 * 10^-2)
		
	}

}
