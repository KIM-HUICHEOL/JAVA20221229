package Ch06;

import java.util.Scanner;

public class C01IF {

	public static void main(String[] args) {
		//01 단순 IF
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >= 8)  // 한 번
//		{
//			System.out.println("학교에 다닙니다.");
//		}
//		System.out.println("첫번째 IF 블럭 종료");
//		if(age < 8)  // 한 번
//		{
//			System.out.println("학교에 다니지 않습니다.");
//		}
//		System.out.println("두번째 IF 블럭 종료");
//		System.out.println("프로그램을 종료합니다.");

		
		//02 IF-ELSE
//		Scanner sc = new Scanner(System.in);
//		int age = sc.nextInt();
//		if(age >= 8)  // 한번만 물어봄
//		{
//			System.out.println("학교에 다닙니다.");  // 참인 경우 종속문장
//		}
//		else
//		{
//			System.out.println("학교에 다니지 않습니다."); // 거짓인 경우 종속문장
		
		
		//1.정수 하나를 입력받은수가 짝수인지 홀수인지 확인 IF문
		//2.정수 하나를 입력받은수가 3의배수인지 아닌지 확인
		//3.두 수를 입력받아 큰 수를 입력
		//4.세 수를 입력받아 큰 수를 출력(&& 연산자 사용)
		
		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();		
	
//1		if (n1 % 2 == 0)
//		{
//			System.out.println("짝수입니다.");
//		}
//		else
//		{
//			System.out.println("홀수입니다.");
//		}
	
		
//3		if (n1 > n2)
//		{
//			System.out.println("큰 수 :" + n1);
//		}
//		else
//		{
//			System.out.println("큰 수 :" + n2);
//		}
	
		
//2		if (n1 % 3 == 0)
//		{
//			System.out.println("3의 배수입니다.");
//		}
//		else
//		{
//			System.out.println("3의 배수가 아닙니다.");
//		}
		
//4		// 값이 중복되면 if문의 한계가 나타남
//		//n1이 제일 큰 경우
//		if(n1 >= n2 && n1 >= n3)
//		{
//			System.out.println("큰 수 : " + n1);
//		}
//		//n2가 제일 큰 경우
//		if(n2 >= n1 && n2 >= n3)
//		{
//			System.out.println("큰 수 : " + n2);
//		}
//		//n3가 제일 큰 경우
//		if(n3 >= n1 && n3 >= n2)
//		{
//			System.out.println("큰 수 : " + n3);
//		}
		
		
		//else if문으로 해결가능 (조건식을 연결할때 사용)
		//n1이 제일 큰 경우
		if(n1 >= n2 && n1 >= n3)
		{
			System.out.println("큰 수 : " + n1);
		}
		//n2가 제일 큰 경우
		else if(n2 >= n1 && n2 >= n3)
		{
			System.out.println("큰 수 : " + n2);
		}
		//n3가 제일 큰 경우
		else if(n3 >= n1 && n3 >= n2)
		{
			System.out.println("큰 수 : " + n3);
		}
	}

}
