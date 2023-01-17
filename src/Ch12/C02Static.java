package Ch12;

class C02Simple
{
	int n1;  //객체 개별공간
	static int n2;  //static변수
	
	void Func1() {
		n1 = 10;
		n2 = 20;
	}
	static void Func2() {  //static멤버 변수에만 접근 가능
		//n1 = 10;	//문제발생 왜??  객체를 만들어줘야 접근 가능하기 때문
		n2 = 20;
		int num = 10;
	}
}

public class C02Static {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
