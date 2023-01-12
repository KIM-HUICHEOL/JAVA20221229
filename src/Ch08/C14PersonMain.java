package Ch08;


class C14Person
{
	//속성(필드, 멤버변수)
	String name;
	int age;
	float height;
	double weight;	

	//기능(멤버함수)  기본적으로 멤버변수 사용할 권한이 있음
	C14Person(String name, int age, float height, double weight) {
		this.name=name;
		this.age=age;
		this.height=height;
		this.weight=weight;
	}
	
	@Override  //우클릭 - source - generate toString()
	public String toString() {
		return "C14Person [name=" + name + ", age=" + age + ", height=" + height + ", weight=" + weight + "]";
	}
	
}

public class C14PersonMain {

	public static void main(String[] args) {
		C14Person hong = new C14Person("홍길동", 55, 177.5f, 80.1);  //생성자 함수를 지정
		System.out.println(hong.toString());  //모든 멤버변수가 확인될수있도록 toString()재정의
	
	}

}
