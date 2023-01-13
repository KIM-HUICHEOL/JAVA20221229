package 패키지생성;

class Student2 {
	void learn() {
		System.out.println("배우기");
	}
	
	void eat() {
		System.out.println("밥먹기");
	}
	
	void say() {
		System.out.println("선생님 안녕하세요!");  //보통의 학생
	}
}

class Leader extends Student2{
	void lead() {
		
	}

	@Override
	void say() {
		System.out.println("선생님께 인사");  //오버라이딩
		super.say();  //부모클래스의 메서드 실행
	}

}

public class as {
	public static void main(String[] args) {
		Leader leader = new Leader();
		leader.eat();  //상속 받은 메서드 사용
		leader.say();  //오버 라이딩한 메서드 사용
	}
}
