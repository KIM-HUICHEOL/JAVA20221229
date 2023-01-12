package Ch08;

class C05Car
{
	String owner;
	int speed;
	int fuel;
	String model;
	
	//기능
	//Accel():void
	void Accel() {	
		// fuel 체크(-5)
		// speed 체크(200km/h, +10)
		if(fuel-5 <= 0) {
			fuel = 0;
			System.out.println("[ERR] 가속불가 - 연료가 부족합니다..");
		}else {
			fuel -= 5;  //연료량에서 -5
			if (speed+10 >= 200) {
				speed = 200;
				System.out.println("[WARN] 가속불가 - 최대속도입니다 200km/h");
			}else {
				speed += 10;  //현재속도에서 +10
				System.out.println("[INFO] 가속합니다. - 현재속도 : " + speed);
			}
		}
	}
		
	//Break():void
	void Break() {
		// speed 체크(0km/h, -15)
		if (speed-15 <= 0) {
			speed = 0;
			System.out.println("[WARN] 감속불가 - 현재속도 0km/h");
		} else {
			speed -= 15;
			System.out.println("[INFO] 현재속도 " + speed + "km/h");
		}

	}
	
	//멤버 정보표시용 함수는 이후 toString()재정의로 대체함
	void info() {
		System.out.printf("%s %d %d %s\n", owner, speed, fuel, model);
		} 
}

public class C05CarMain {  //자바파일명과 메인함수명이 다르면 문제가 발생함

	public static void main(String[] args) throws InterruptedException {
		C05Car hong = new C05Car();
		hong.owner = "홍길동";
		hong.speed = 100;
		hong.fuel = 200;
		hong.model = "아반떼xd";
		
		//hong.info();  //owner, speed, fuel, model 출력
		while (true)
		{
			//hong.Accel();
			hong.Break();
			Thread.sleep(500);  //0.5초 정도 정지하다가 실행
		}
	}

}
