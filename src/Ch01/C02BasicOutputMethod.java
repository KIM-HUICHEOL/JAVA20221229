package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		
		// System : OS관련 자원들을 저장하는 단위
		// .	  : --안에
		// out    : 표준출력장치
		
		// System.out.print()
		// 기본 출력함수
		// Escape 문자
		//System.out.print("HELLOWORLD\n");
		//System.out.print("HELLOWORLD\n");
		
//		   *
//	   	  ***	
//	  	 *****	
//   	*******
		
//		System.out.print("   *   \n");
//		System.out.print("  ***  \n");
//		System.out.print(" ***** \n");
//		System.out.print("*******\n");
		
//https://naver.me/56DXSqCg
//		\\192.168.3.254\평일JAVA
		// System.out.printf()
		// format : 형식, 서식
		// %d : 10진 정수 서식문자
		// %f : 실수 서식문자
		// %c : 한문자 서식문자
		// %s : 문자열 서식문자
		
//		System.out.printf("%d %d %d\n", 10, 20, 30);
//		System.out.printf("%f %f %f\n", 10.1234, 20.1234, 30.1234);
//		System.out.printf("%.1f %.2f %.3f\n", 10.1234, 20.1234, 30.1234);
//		System.out.printf("%c %c %c\n", 'a', 'b', 'c');
//		System.out.printf("%s %s %s\n", "Hello", "My Name is", "Honggildong");
	
		// 다음과 같이 출력합니다.(서식문자 + 이스케이프 문자)
//		NO		이름		나이		주소
//		1		홍길동	50		대구
//		2		서길동	40		서울
//		3		동길동	30		울산
		
//		System.out.printf("%s   %s   %s   %s\n", "NO", "이름", "나이", "주소");
//		System.out.printf("%d   %s   %d   %s\n", 1, "홍길동", 50, "대구");
//		System.out.printf("%d   %s   %d   %s\n", 2, "서길동", 40, "서울");
//		System.out.printf("%d   %s   %d   %s\n", 3, "동길동", 30, "울산");
//		
//		System.out.print("\n");

			
		// System.out.println() : 개행(띄어쓰기)포함 print 함수
//		System.out.println("HELLO WORLD");
//		System.out.println("HELLO WORLD");
//		System.out.println("HELLO WORLD");

	}

}
