package Ch06;

import java.util.Scanner;

public class C02Elseif {

	public static void main(String[] args) {
		//국어, 영어, 수학
		//각 과목당 40점 미만 불합격
		//평균이 60점 미만이면 불합격
		//그게 아니라면 합격
		
		//국어 < 40 -> 불합격
		//영어 < 40 -> 불합격
		//수학 < 40 -> 불합격
		//평균 < 60 -> 불합격
		
//		int kor = 0, eng = 0, mat = 0, sum = 0;
//		double avg = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		kor = sc.nextInt();
//		eng = sc.nextInt();
//		mat = sc.nextInt();
//		sum = kor + eng + mat;
//		avg = (double)sum / 3;
//		
//		if (kor < 40)
//		{
//			System.out.println("불합격!");
//		}
//		else if (eng < 40)
//		{
//			System.out.println("불합격!");
//		}
//		else if (mat < 40)
//		{
//			System.out.println("불합격!");
//		}
//		else if (avg < 60)
//		{
//			System.out.println("불합격!");
//		}
//		else 
//		{
//			System.out.println("합격입니다!");
//		}
		
		
		//나이별로 요금을 부과하는 else if문 만들기
		//나이는 정수값으로 입력
		//8세미만 : 요금 1000원
		//14세미만 : 요금 2000원
		//20세미만 : 요금 2500원
		//20세이상 : 요금 3000원
		
		
		
		Scanner sc = new Scanner(System.in);
		int age = 0;
		int charge = 0;
		age = sc.nextInt();
		
		if (age < 8)  // ~7
		{
			charge = 1000;
		}
		else if (age < 14)  // 8~13
		{
			charge = 2000;
		}
		else if (age < 20)  // 14~19
		{
			charge = 2500;
		}
		else  // 20~
		{
			charge = 3000;
		}
		System.out.println("요금 : " + charge);
		
	}

}
