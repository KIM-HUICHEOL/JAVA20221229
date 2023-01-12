package Ch09;

class C02Person{
	//속성
	String name;	//이름
	private String id;		//주민번호
	private int age;		//나이
	float weight;	//몸무게
	double height;  //키
	private int salary;		//급여정보
	
	//생성자(모든 인자 받는 생성자)  //우클릭 - source - generating constructor using fields ()
	public C02Person(String name, String id, int age, float weight, double height, int salary) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.weight = weight;
		this.height = height;
		this.salary = salary;
	}
	
	//Setter함수
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	//Getter함수
	public int getSalary() {
		return this.salary;
	}
	
	//나머지 private 멤버를 getter and setter 함수로 완성하기(id는 getter만 만들기)
	//age Setter함수
	public void setAge(int age) {
		this.age=age;
	}
	
	//age Getter함수
	public int getAge() {
		return this.age;	
	}
	
	
	//id Getter함수
	public String getId() {
		return this.id;
	}
}

public class C02InfoHide {

	public static void main(String[] args) {
		C02Person obj = new C02Person("홍길동", "888888-1111111", 40, 80.5f, 177.5, 8000);
		
	}

}
