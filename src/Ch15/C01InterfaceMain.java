package Ch15;

interface C01Remocon
{
	//필드(final static, 값 고정)
	int MAX_VOLUMN = 10;
	int MIN_VOLUMN = 0;
	//기능(추상메서드)
	void turnOn();
	void turnOff();
	void setVolumn(int vol);
}
class C01TV implements C01Remocon{

	int vol;
	@Override
	public void turnOn() {
		System.out.println("TV를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolumn(int vol) {
		if(vol >= MAX_VOLUMN) {
			vol = MAX_VOLUMN;
		}else if(vol <= MIN_VOLUMN) {
			vol = MIN_VOLUMN;
		}else {
			this.vol = vol;
		}
	}
	
}
class C01Radio implements C01Remocon{

	int vol;
	@Override
	public void turnOn() {
		System.out.println("라디오를 킵니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("라디오를 끕니다.");
	}
	
	@Override
	public void setVolumn(int vol) {
		// TODO Auto-generated method stub
	}
	
}


public class C01InterfaceMain {

	public static void TurnOn(C01Remocon controller) {
		controller.turnOn();
	}
	public static void TurnOff(C01Remocon controller) {
		controller.turnOff();
	}
	public static void SetVol(C01Remocon controller, int num) {
		controller.setVolumn(num);
	}
	
	public static void main(String[] args) {
		C01TV tv = new C01TV();
		C01Radio radio = new C01Radio();
		
		TurnOn(tv);
		TurnOn(radio);
		SetVol(tv, 7);
		System.out.println(tv.vol);
		
		
		
		//인터페이스
		//멤버변수 : final static (공유 상수)
		//멤버함수 : 추상메서드 (->상속받는 클래스가 완성시켜라)
		//일반메서드 x
		//일반멤버변수 x
		//1) 낮은 결합도
		//2) 

	}

}
