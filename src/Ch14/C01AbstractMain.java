package Ch14;

class par1 {
	void method1() {}  // 일반메서드
}
class son1 extends par1 {
	void method1() {
		System.out.println("Son1의 자율적 재정의된 메서드 ");
	}
}
//--------------추상 클래스 상속관계-------------
abstract class par2 {
	abstract void method2();  // 추상메서드(미완성된 함수)
}

class son2 extends par2 {
	
	@Override
	void method2() {
		System.out.println("Son2에서 강제 재정의된 메서드");
	}
	
}

public class C01AbstractMain {

	public static void main(String[] args) {
		par1 ob1 = new par1();  //객체 만들어짐 o
		son1 ob2 = new son1();  //객체 만들어짐 o
		ob1 = ob2;  			//upcasting o
		ob1.method1();  		//재정의된 son1메서드 호출가능!

		//par2 ob3 = new par2();  //추상클래스로 객체 생성불가 x
		son2 ob4 = new son2();    //하위클래스에서 물려받은 추상메서드를 재정의한다면 객체생성 가능 o
		par2 ob5 = ob4;			  //upcasting o
		ob5.method2();			  //재정의된 son1메서드 호출가능!
		
		
		//추상클래스
		//추상메서드(미완성된 함수, 상속관계 전제함)를 하나이상 포함하고 있는 클래스
		//일반메서드 생성 가능
		//일반멤버변수 선언 가능
		//추상클래스로는 객체 생성 불가능하므로 참조변수에 연결되는 객체 : 하위클래스형으로 만든 객체(업캐스팅)
		//하위클래스의 오버라이딩(함수재정의)된 멤버 변수에 접근 가능하다!!
		
		
	}

}
