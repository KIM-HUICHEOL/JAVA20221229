package Ch05;

public class C01연산자 {

	public static void main(String[] args) {
		
		//산술연산자 ( + - * / % )		
		int a = 10, b = 20, c;
		System.out.println("a+b ="+ (a + b));
		System.out.println("a-b ="+ (a - b));
		System.out.println("a*b ="+ (a * b));
		System.out.println("b/a ="+ (b / a));  //나누기 - 몫
		System.out.println("a%b ="+ (a % b));  //나누기 - 나머지(1.짝홀수구분, 2.배수구분, 3.자리수제한, 4.끝자리구하기)
		System.out.println("-a ="+ -a);
		
		//대입연산자 
		//공간(lv) = 값(우선처리, rv)
		
		//문제
		//두 정수를 입력받아 두 수의 합 / 곱 / 차를 출력하는 프로그램을 만듭니다.
		//Scanner 를 사용합니다.
		
		//복합대입연산자(선택)
		int a = 10;
		a += 10;  //a = a + 10;
		a -= 5;  //a = a - 5;
		a *= 3;  // a = a * 3;
		System.out.println("a="+a);
		
		//비교연산자(*중요!) ( > >= < <= == !=, 결과 = true / false)
		int a = 10;
		int b = 20;
		System.out.println("A == B : "+ (a == b));  // a=b 와 혼동하지 말것!(얘는 대입연산자)
		System.out.println("A  > B : "+ (a > b));
		System.out.println("A  < B : "+ (a < b));
		System.out.println("A >= B : "+ (a >= b));
		System.out.println("A <= B : "+ (a <= b));
		System.out.println("A != B : "+ (a != b));
		
		//논리연산자(*중요!)
		// And연산 && : 모든 조건식이 true이어야지만 true을 반환
		// Or연산 || : 연결되는 조건식 중 하나라도 true이면 true를 반환
		// !(논리부정) : true라면 false반환, false라면 true반환
		
		System.out.println("true  AND true = " +  (true  && true));		//o
		System.out.println("false AND true = " +  (false && true));		//x
		System.out.println("true  AND false = " + (true  && false));	//x
		System.out.println("false AND false = " + (false && false));	//x
		
		int a = 20, b = 10, c = 5;
		System.out.println("true  AND true = " +  ((10>5) && (6>4)));		
		System.out.println("false AND true = " +  (false  && true));		
		System.out.println("true  AND false = " + (true   && false));		
		System.out.println("false AND false = " + (false  && false));	

		System.out.println("true  OR true = " +   (true  || true));	    //o
		System.out.println("false OR true = "  +  (false || true));	    //o
		System.out.println("true  OR false = " +  (true  || false));	//o
		System.out.println("false OR false = "  + (false || false));	//x
		int a = 10, b = 20, c = 5;
		System.out.println("true OR true = " +   ((a>b) || (a>c)));
		
		//코드 가독성 향상을 위해 사용
		boolean flag = true;
		System.out.println("flag : " + flag);
		System.out.println("!flag : " + !flag);
		
		//증감연산자(++, --) c언어에서 중요
		//++a(--a) : 전치 연산자 : 먼저 값 1증가(1감소) 이후 다른 연산자 처리
		//a++(a--) : 후치 연산자 : 다른 연산자 처리 먼저 한 후  1증가(1감소)
		
		int a = 10, b = 10, c, d;		
		c = --a;  //a값 1감소 후 c에 대입
		d = a--;  //a값 d에 대입 후 1감소
		c = --a + b--;  //a값 1감소 후 c대입, b값 c대입 후 1감소
 		d = a-- + b--;  //a값 d대입 후 1감소, b값 1감소 후 d대입
		System.out.printf("a=%d, b=%d, c=%d, d=%d", a, b, c, d);
		
		//삼항연산자(분기문)
		//(조건식)? 참인경우 실행코드 : 거짓인경우 실행코드;

		int score = 85;
		char grade = (score > 90)? 'A' : 'B';
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		int kor = 85;
		int eng = 60;
		char grade = (kor>80 && eng>80)? 'A' : 'B';
		System.out.println(grade + "등급입니다.");
		
		
		
		
		
	}

}
