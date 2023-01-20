package Ch13;

//---------------------------
//멤버함수의 동작방식
//---------------------------
//클래스 영역에서의 저장 : static변수,static메서드,인스턴스(일반)메서드(1회이상호출),생성자메서드
//static은 객체 생성 전에 클래스영역에 저장
//일반메서드는 객체 1회이상 생성 시 클래스영역에 저장(재사용성)

class Super
{
	int num1;
	public void sound(){System.out.println("Sound1()");}		
}
class Sub extends Super
{
	int num2;//확장
	public void move(){System.out.println("Sub1 move1()");}		//확장
	public void sound(){System.out.println("Sub's Sound1()");}	//재정의
}


public class C04MethodInfo {

	public static void main(String[] args) {
		//정상범위(Nocasting)
//		Super ob1 = new Super();
//		Super ob2 = new Super();
//		Sub ob3 = new Sub();
		
		//Upcasting(상위클래스 참조변수 = 하위객체주소)
		Super ob4 = new Sub();
		ob4.num1 = 10;
		ob4.sound();
		//ob4.move(); 접근 불가
		
		//Downcasting(하위클래스 참조변수 = 상위객체주소)
		Sub down = (Sub)ob4;
		down.num2 = 20;
		down.move();
		
		
		//업캐스팅
		//상속관계를 전제로 하여 하위클래스가 다를 수 있는 모든 객체를 연결할 수 있는 참조변수로 사용
		//자동클래스형변한 한다.
		//상위클래스 참조변수로 하위객체를 연결하는 형태
		//상위클래스 참조변수는 물려받는 속성에 접근 가능하다
		//상위클래스 참조변수는 물려받는 기능에 접근 가능하다
		//상위클래스 참조변수는 추가(확장)된 하위 멤버에 접근 불가능하다
		//상위클래스 참조변수는 오버라이딩(함수재정의)된 멤버 변수(하위클래스)에 접근 가능하다!!
		
		
		//다운캐스팅
		//업캐스팅된 상태에서 확장된 멤버에 접근하기 위해 클래스자료형변환을 하는 문법
		//강제클래스형변환 해야한다.
		
		
	}

}
