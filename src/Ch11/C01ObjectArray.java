package Ch11;

class C01Person{
	String name;
	String age;
	String addr;
	
	//toString 재정의
	@Override
	public String toString() {
		return "C01Person [name=" + name + ", age=" + age + ", addr=" + addr + "]";
	}

}
	
public class C01ObjectArray {


	public static void main(String[] args) {
		C01Person [] employee = new C01Person[3];  //employee : 배열형 참조변수
		
		employee[0] = new C01Person();  //C01Person이라는 객체 생성해줘야 함
		
		employee[1] = new C01Person(); 
		
		
		employee[0].name = "홍길동";
		employee[0].age = "44";
		employee[0].addr = "대구";
		
		employee[1].name = "남길동";
		employee[1].age = "22";
		employee[1].addr = "서울";
		
		//employee[1]에 객체 연결,  이름 : 남길동, 나이 : 22, 주소 : 서울
		
		System.out.println(employee[0].toString());
		System.out.println("");
		System.out.println(employee[1].toString());

	}

}
