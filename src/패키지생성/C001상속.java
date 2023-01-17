package 패키지생성;  //패키지 내에는 동일한 클래스가 들어가면 충돌이 일어남

//상속 
//새로운 클래스를 작성할 때 기존에 존재하는 클래스를 물려받아 이용
//기존 클래스 가진 멤버 물려받기 때문에 새로 작성할 코드 양 줄어드는 효과 있음
//자신의 멤버 물려주는 클래스 : 부모 or 조상 클래스
//상속받는 클래스 : 자식 클래스


class Person {//사람 클래스 
	void breath() {
		System.out.println("숨쉬기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("말하기");
	}
}


class Student extends Person {//사람(부모) 클래스를 상속한 학생(자식) 클래스
	void learn() {
		System.out.println("배우기");
	}
}


class Teacher extends Person {//사람 클래스를 상속한 선생 클래스
	void teach() {
		System.out.println("가르치기");
	}
}


public class C001상속 {

	public static void main(String[] args) {
		Student s1 = new Student();  //학생 인스턴스
		s1.breath();  //사람 클래스의 breath 메서드를 상속 받았음
		s1.learn();
		s1.say();

		
		Teacher t1 = new Teacher();  //선생 인스턴스 t1 생성
		t1.eat();  //사람 클래스의 eat 메서드를 상속 받았음
		t1.teach();
		t1.say();

		Person person = new Person();
		person.breath();
		//person.learn();  //자식 클래스의 메서드나 멤버 변수는 사용하지 못함.
		
	}

}
