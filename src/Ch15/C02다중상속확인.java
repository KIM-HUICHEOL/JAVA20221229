package Ch15;

//class A{}
//class B{}
//class C{}


//class A{}
//class B{}
//class C extends A, b{}  //다중상속 X


//interface A{}
//interface B{}
//class C implements A, B{}  //interface는 다중상속 가능 O


interface A{}
interface B{}
class C{}
class D extends C implements A, B{}  // extends 후 implements후 다중상속 가능 O
//class D implements C extends A, B{}  // extends 가 implements보다 먼저 와야한다!


public class C02다중상속확인 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
