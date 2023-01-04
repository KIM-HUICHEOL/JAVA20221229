package Ch04;

import java.util.Scanner;  // Ctrl + Shift + o : 자동 표현

public class C01Scanner {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);  // Scanner 장치 생성 코드  
		
		int num1 = sc.nextInt();  // 키보드로 입력 전까지 코드 일시정지
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		int num4 = sc.nextInt();
		int sum = num1 + num2 + num3 + num4;
		System.out.printf("%d + %d + %d + %d = %d \n", num1, num2, num3, num4, sum);
		sc.close();  // Scanner 장치 제거 코드

	}

}
