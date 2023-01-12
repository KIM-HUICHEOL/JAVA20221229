package Ch08;


class C04Person
{
	//속성(필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;
	
	//기능(멤버함수)  기본적으로 멤버변수 사용할 권한이 있음
	void talk() {  //void : 반환 자료형
		System.out.println(name + " 님이 말합니다.");
	}
	
	void walk() {
		System.out.println(name + " 님이 걷습니다.");
	}
	
	void info() {
		System.out.printf("%s %d %f %f\n", name, age, height, weight);
	}
	
}

public class C04PersonMain {

	public static void main(String[] args) {
		C04Person hong = new C04Person();
		hong.name = "홍길동";
		hong.age = 55;
		hong.height = 177.5f;
		hong.weight = 70.5;
//		System.out.printf("%s %d %f %f\n", hong.name, hong.age, hong.height, hong.weight);

		hong.talk();
		hong.walk();
		hong.info();
	}

}
