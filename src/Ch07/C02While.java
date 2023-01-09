package Ch07;

import java.util.Scanner;

public class C02While {

	public static void main(String[] args) {
		
		//구구단(2단 - 9단)		
//		int dan = 2;
//		int i = 1;
//		while (dan <= 9)
//		{
//			i = 1;
//			while (i <= 9)
//			{
//				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println();
//			dan++;
//		}
		
		//2단 ~ 9단 출력
//		9 x 1 = 9
//		9 x 2 = 18
//		9 x 3 = 27
//		...
//		8 x 1 = 8
//		8 x 2 = 16
//		...
//		
//		2 x 9 = 18
				
//		int dan = 9;
//		int i = 1;
//		while (dan >= 2)
//		{
//			i = 1;
//			while (i <= 9)
//			{
//				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//				i++;
//			}
//			System.out.println();
//			dan--;
//		}
			
		
		//2단 ~ 9단 출력
//		9 x 9 = 81
//		9 x 8 = 72
//		9 x 7 = 63
//		...
//		
//		2 x 1 = 2		
	
//		int dan = 9;
//		int i = 9;
//		while (dan >= 2)
//		{
//			i = 9;
//			while (i >= 1)
//			{
//				System.out.printf("%d * %d = %d\n", dan, i, dan * i);
//				i--;
//			}
//			System.out.println();
//			dan--;
//		}
		
		
		//N단을 입력받아 N단부터 9단까지 출력
		
//		Scanner sc = new Scanner(System.in);
//	
//		int N = sc.nextInt();
//		int i = 1;
//		while (N <= 9)
//		{
//			i = 1;
//			while (i <= 9)
//			{
//				System.out.printf("%d * %d = %d\n", N, i, N * i);
//				i++;
//			}
//			System.out.println();
//			N++;
//		}
		
		
		//N, M을 입력받아 N단부터 M단까지 출력(N < M and N < 8, M <= 9)		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();
//		int M = sc.nextInt();
//		while (N < 8)
//		{
//			while (M <= 9)
//			{
//				System.out.printf("%d * %d = %d\n", N, M, N * M);
//				M++;
//			}
//			
//		}
		
		
		//1
		//*****
		//*****
		//*****
		//*****

		//i(줄바꿈)  j(별찍기)
		//i=0      j=0
		//i++      j++
		//i<4      j<5
		
//		int i = 0;  //줄바꿈
//		int j = 0;  //별찍기
//		while (i < 4)
//		{
//			j = 0; 
//			while (j < 5)
//			{
//				System.out.print("*");  // 개행x 기본 print로 입력
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//2
		//*
		//**
		//***
		//****
		
		//i(줄바꿈)  j(별찍기)
		//i=0      j=0
		//i++      j++
		//i<4      j<=i
		
//		int i = 0;  //줄바꿈
//		int j = 0;  //별찍기
//		while (i < 4)
//		{
//			j = 0; 
//			while (j <= i)
//			{
//				System.out.print("*");  // 개행x 기본 print로 입력
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//2-1높이만큼의 직각삼각형별이 출력되도록 합니다.
		//높이 입력 : 3
		//*
		//**
		//***
		
		//i(줄바꿈)  j(별찍기)
		//i=0      j=0
		//i++      j++
		//i<N      j<=i
		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();  //높이 입력
//		int i = 0;  //줄바꿈
//		int j = 0;  //별찍기
//		while (i < N)
//		{
//			j = 0; 
//			while (j <= i)
//			{
//				System.out.print("*");  // 개행x 기본 print로 입력
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//3
		//****
		//***
		//**
		//*
		
		//i(줄바꿈)  j(별찍기)
		//i=0      j=0
		//i++      j++
		//i<4      j<=3-i
		
//		int i = 0;  //줄바꿈
//		int j = 0;  //별찍기
//		while (i < 4)
//		{
//			j = 0; 
//			while (j <= 3-i)
//			{
//				System.out.print("*");  // 개행x 기본 print로 입력
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//3-1.높이 입력 : 3
		//***
		//**
		//*
		
		//i(줄바꿈)  j(별찍기)
		//i=0      j=0
		//i++      j++
		//i<N      j<=(N - 1) - 1
		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt();  //높이 입력
//		int i = 0;  //줄바꿈
//		int j = 0;  //별찍기
//		while (i < N)
//		{
//			j = 0; 
//			while (j <= (N - 1) - i)
//			{
//				System.out.print("*");  // 개행x 기본 print로 입력
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		//4
		//   *
		//  ***
		// *****
		//*******
		
		//i(줄바꿈)  j(공백)   k(별찍기)
		//i=0      j=0      k=0
		//i++      j++		k++
		//i<4      j<=2-i   k<=2*i
		
//		int i = 0;  //줄바꿈
//		int j = 0;  //공백
//		int k = 0;  //별찍기
//		while (i < 4)
//		{  
//			//공백
//			j = 0; 
//			while (j <= 2-i)
//			{
//				System.out.print(" ");  // 개행x 기본 print로 입력
//				j++;
//				
//			}
//			//별찍기
//			k=0;
//			while (k <= 2 * i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//
//		}

		
		//4-1 높이 : 3
		//   *
		//  ***
		// *****
		
		//i(줄바꿈)  j(공백)       k(별찍기)
		//i=0      j=0          k=0
		//i++      j++		    k++
		//i<h      j<=(h-2)-i   k<=2*i
		
//		Scanner sc = new Scanner(System.in);
//		
//		int h = sc.nextInt();  //높이 입력
//		int i = 0;  //줄바꿈
//		int j = 0;  //공백
//		int k = 0;  //별찍기
//		while (i < h)
//		{  
//			//공백
//			j = 0; 
//			while (j <= (h-2) - i)
//			{
//				System.out.print(" ");  // 개행x 기본 print로 입력
//				j++;
//				
//			}
//			//별찍기
//			k=0;
//			while (k <= 2 * i)
//			{
//				System.out.print("*");
//				k++;
//			}
//			System.out.println();
//			i++;
//
//		}
		
		
		//5
		//*******
		// *****
		//  ***
		//   *
		
		//i(줄바꿈)  j(별찍기)
		//i=0      j=0
		//i++      j++
		//i<4      j<=7-(i*2)
		
//		int i = 0;  //줄바꿈
//		int j = 0;  //별찍기
//		while (i < 4)
//		{
//			j = 0; 
//			while (j < 7 - (i*2))
//			{
//				System.out.print("*");  // 개행x 기본 print로 입력
//				j++;
//			}
//			System.out.println();
//			i++;
//			if (i == 1)
//			{
//				System.out.print(" ");
//			}
//			else if (i == 2)
//			{
//				System.out.print("  ");
//			}
//			else if (i == 3)
//			{
//				System.out.print("   ");
//			}
//			
//		}		
		
		
		//5-1 높이 : 3
		// *****
		//  ***
		//   *
		
		//i(줄바꿈)  j(공백)       k(별찍기)
		//i=0      j=0          k=0
		//i++      j++		    k++
		//i<h      j<=h-(h-1)   k<=
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();  //높이 입력
		int i = 0;  //줄바꿈
		int j = 0;  //공백
		int k = 0;  //별찍기
		while (i < h)
		{  
			//공백
			j = 0; 
			while (j <= h - (h-i))
			{
				System.out.print(" ");  // 개행x 기본 print로 입력
				j++;	
			}
			//별찍기
			k=0;
			while (k <=)
			{
				System.out.print("*");
				k++;
			}
			System.out.println();
			i++;

		}
		
		
		
	}

}
