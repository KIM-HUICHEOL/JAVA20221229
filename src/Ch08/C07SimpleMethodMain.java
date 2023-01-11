package Ch08;

import java.util.Scanner;

class Sum{
	//속성
	Scanner sc = new Scanner(System.in);
	//기능
	//인자o, return o
	int sum1(int x, int y) {  //10, 20을 파라미터 변수(int x, int y)에 저장
		return x + y;  //main함수로 돌아감
	}
	
	//인자 o, return x
	void sum2(int x, int y) {
		System.out.println("SUM2(x, y) : " + (x+y));  //main함수로 돌아감
	}
	
	//인자 x, return o
	int sum3() {
		System.out.println("SUM3(x, y) : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x+y;
	}
	
	//인자 x, return x
	void sum4() { 
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		System.out.println("SUM4(x, y, z) : " + (x+y+z));
	}
}


public class C07SimpleMethodMain {

	public static void main(String[] args) {
		
		Sum clac = new Sum();  // 객체 생성
		
		int r1 = clac.sum1(10, 20);  // Sum class로 이동
		System.out.println("R1 : " + r1);
		
		clac.sum2(10, 20);
		
		int r3 = clac.sum3();
		System.out.println("R3 : " + r3);
		
		clac.sum4();  //sc로 세 수를 입력받아 세 수의 합이 console 출력
		
	}

}
