package Ch03;

public class C05형변환나눗셈 {

	public static void main(String[] args) {
		int num1 = 10, num2 = 4;
		double dnum1 = num1 / num2;				//피연산자 num1은 int 형이기 때문에 연산후에 소수점 데이터손실
		
		double dnum2 = (double)num1 / num2; 	//나누는 수를 double형으로 강제형변환 함으로서 연산결과 발생되는
												//소수점을 표현할 공간을 마련
		
		double dnum3 = (1.0*num1) / num2;
		System.out.println("dnum1 : " +dnum1);
		System.out.println("dnum2 : " +dnum2);
		System.out.println("dnum3 : " +dnum3);
		
		
		
		
		
		
		
	}

}
