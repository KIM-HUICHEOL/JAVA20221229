package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		
		//기본 while문
		
//		int i = 0;  //탈출용 변수 지정
//		while(i < 10)  //(어떤 특정 시점에서 반복문 벗어나게 하는)조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;  //조건식이 거짓이 되게끔 하기 위한 연산
//		}
		
		
		// 1부터 10까지의 합 구하기
		
//		int i = 1;
//		int sum = 0;
//		while(i <= 10)
//		{
//			System.out.println("i 값 : " + i);
//			sum += i;  //sum에 i값 추가해서 sum에 넣음
//			i++;
//		}  //나가는 시점 : i가 11이 될 때
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		
		//1부터 N까지(키보드로부터 입력) 수의 합
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int i = 1;
//		int sum = 0;
//		while (i <= N)
//		{
//			System.out.println("i의 값 : " + i);
//			sum += i;
//			i++;
//		}
//		//System.out.println("1부터 N까지의 합 : " + sum);
//		System.out.printf("1부터 %d까지의 합 : %d", N, sum);
		
		
		
		//N부터 M까지의 합(N, M은 키보드로부터 입력)
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		int i = N;
//		int sum = 0;
//		while (i <= M)
//		{
//			System.out.println("i의 값 : " + i);
//			sum += i;
//			i++;
//		}
//		//System.out.println("N부터 M까지의 합 : " + sum);
//		System.out.printf("%d부터 %d까지의 합 : %d", N, M, sum);
			
		
		
		//N부터 M까지의 합(N, M은 키보드로부터 입력), 조건 N>M
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		
//		if(N>M)  //N과 M을 바꿔주는 if문
//		{
//			//Swap
//			int tmp = N;
//			N = M;
//			M = tmp;
//		}
//		
//		int i = N; 
//		int sum = 0;
//		while (i <= M)
//		{
//			System.out.println("i의 값 : " + i);
//			sum += i;
//			i++;
//		}
//		//System.out.println("N부터 M까지의 합 : " + sum);
//		System.out.printf("%d부터 %d까지의 합 : %d", N, M, sum);
		
		
		//구구단(2단)
//		int dan = 2;
//		int i = 1;
//		while(i <= 9)
//		{
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			i++;
//		}
		
		//구구단(N단)
//		Scanner sc = new Scanner(System.in);
//		int dan = sc.nextInt();
//		int i = 1;
//		while(i <= 9)
//		{
//			System.out.printf("%d * %d = %d\n", dan, i, dan*i);
//			i++;
//		}
		
		
		//1부터 10까지 수 중의 4의 배수만 출력
//		int i = 1;
//		
//		while(i <= 10)
//		{
//			if (i % 4 == 0)
//				System.out.println("i 값 : " + i);
//			i++;
//		}
		
		//1부터 N까지 수 중의 4의 배수만 출력		
//		Scanner sc = new Scanner(System.in);
//		int N = sc.nextInt();
//		int i = 1;
//		while(i <= N)
//		{
//			if (i % 4 == 0)
//				System.out.println("i 값 : " + i);
//			i++;
//		}
		
		//1부터 10까지 수 중에 3의 배수와 합만 출력
//		int i = 1;
//		int sum = 0;
//		while(i <= 10)
//		{
//			if (i % 3 == 0)
//				System.out.println("i 값 : " + i);
//			if (i % 3 == 0)
//				sum += i;
//			i++;
//		}
//		System.out.printf("3의 배수의 합 : %d", sum);
		
		//1부터 N까지 수 중에 3의 배수와 합만 출력
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		int sum = 0;
		while(i <= N)
		{
			if (i % 3 == 0) {
				System.out.println("i 값 : " + i);
				sum += i;
			}
			i++;
		}
		System.out.printf("3의 배수의 합 : %d", sum);
	}

}
