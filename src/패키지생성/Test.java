package 패키지생성;

public class Test {// 상속받는 다른 방법

	public static void main(String[] args) {
		GeneralChick generalChick = new GeneralChick();
		generalChick.display();
		RedChick redChick = new RedChick();
		redChick.display();
		System.out.println(redChick.x);

	}

}
