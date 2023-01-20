package Ch16;


class A{
	int x;
	int y;
	
	@Override
	public String toString() {
		return "A [x=" + x + ", y=" + y + "]";
	}
	
	
	
}
public class C01Object {

	public static void main(String[] args) {
		Object ob1 = new Object();
		System.out.println(ob1.toString());  		//java.lang.Object@626b2d4a
		System.out.println(ob1);  					//참조 변수로 넣으면 생략해도 toString() 선언됨
		System.out.println(ob1.getClass());  		//class java.lang.Object
		System.out.printf("%x\n", ob1.hashCode());  //626b2d4a
		System.out.println();
		
		A ob2 = new A();
		System.out.println(ob2.toString());  		//A에 재정의됨(toString)
		System.out.println(ob2);  					
		System.out.println(ob2.getClass());  		//class Ch16.A
		System.out.printf("%x\n", ob2.hashCode());  //555590
		System.out.println();
		
		Object ob3 = new A();  //Upcasting
		System.out.println(ob3.toString());  		
		System.out.println(ob3);  					
		System.out.println(ob3.getClass());  		
		System.out.printf("%x\n", ob3.hashCode());  
		System.out.println();
	}

}
