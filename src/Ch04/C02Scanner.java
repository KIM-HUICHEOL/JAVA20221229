package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);       // Ctrl + Shift + o (자동 Import 지정)
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + num1);
		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);
		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();      				// 문자열 입력받기가 가능한 함수, 띄어쓰기는 포함하지 않는다.
//		System.out.println("입력된 문자열 : " + str1);

//		System.out.print("문자열 입력 : ");
//		String str1 = sc.nextLine();      				// 문자열 입력받기가 가능한 함수, 띄어쓰기 포함한다.
//		System.out.println("입력된 문자열 : " + str1);

//----------------------------------------------------------------------------------------------------
		//*주의* nextLine() 사용 시 주의점
		//nextInt(), nextDouble(), next()함수 사용 이후에
		//nextLine()함수를 사용해서 문자열을 받는 경우
		//sc.nextLine()을 한번 더 사용해서 읽어들이는 버퍼라인을 초기화한다.

		//버퍼 : 임시공간, Stream(스트림) : 데이터가 이동되는 통로(채널) 단방향성.
		
		
		System.out.print("정수 입력 : ");
		int num1 = sc.nextInt();
		System.out.println("입력된 정수 값 : " + num1);

		sc.nextLine();                                  // nextLine()한번 더 적어서 오류 방지
		System.out.print("문자열 입력 : ");
		String str1 = sc.nextLine();      				// 문자열 입력받기가 가능한 함수, 띄어쓰기 포함한다.
		System.out.println("입력된 문자열 : " + str1);
		
		
		sc.close();

	}

}
