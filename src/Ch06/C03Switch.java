package Ch06;

public class C03Switch {

	public static void main(String[] args) {
		int ranking = 1;  // 등수 받아오기
		char medalColor;  // 메달색상 변수
		switch(ranking)  // 스위치문 (조건식 여러개 가능), else-if문으로 대부분 구현 가능, break 사용 주의!
		{
		case 1:  // 첫번째 케이스(ranking이 1일때), case에는 상수값만 가능
			medalColor = 'G';
			System.out.println("메달색상 : G");
			break;  // 스위치문 벗어나게 하는 예약어
		case 2:  // 두번째 케이스(ranking이 2일때)
			medalColor = 'S';
			System.out.println("메달색상 : S");
			break;
		case 3:  // 세번째 케이스(ranking이 3일때)
			medalColor = 'B';
			System.out.println("메달색상 : B");
			break;
		default:  // 그 외 나머지
			medalColor = 'C';
			System.out.println("메달색상 : C");
		}
		System.out.println(ranking + " 등 메달의 색은" + medalColor + "입니다.");
		
	}

}
