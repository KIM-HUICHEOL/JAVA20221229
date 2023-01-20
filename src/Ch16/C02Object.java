package Ch16;


class C02Simple {
	int x;
	int y;
	C02Simple(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	@Override
	public boolean equals(Object obj)  //Object obj = ob2; => Upcasting
	{
		if(obj instanceof C02Simple) {
			C02Simple down = (C02Simple)obj;
			return this.x == down.x && this.y == down.y;  //객체로 값 비교
		}
		return false;
	}

}



public class C02Object {

	public static void main(String[] args) {
		C02Simple ob1 = new C02Simple(10, 20);
		C02Simple ob2 = new C02Simple(30, 40);
		C02Simple ob3 = new C02Simple(10, 20);
		System.out.println(ob1.equals(ob2));  //주소가 다르므로 false가 뜸
		System.out.println(ob1.equals(ob3));
		System.out.println(ob2.equals(ob3));
		
	}

}
