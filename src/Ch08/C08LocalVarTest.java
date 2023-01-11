package Ch08;

//지역 변수 : {}내에서 선언된 변수, {}벗어나면 소멸, 절차지향 문법에서 파생됨

class LocalVar{
	//속성
	int num = 10;
	
	void func1() {
		System.out.println("NUM : " + num);  //멤버변수 num을 의미
		if(true) 
		{
			int num = 105;
			System.out.println("NUM : " + num);  //if() 안에서만 사용되는 지역변수 num
		}
		System.out.println("NUM : " + num);  //멤버변수 num을 의미
	}
	void func2() {}
	
	
}

public class C08LocalVarTest {

	public static void main(String[] args) {
		LocalVar obj = new LocalVar();
		
		obj.func1(); 
		
	}

}
