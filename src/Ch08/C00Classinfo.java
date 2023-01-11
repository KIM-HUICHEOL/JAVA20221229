package Ch08;

import java.util.Scanner;

public class C00Classinfo {

	//1 객체란?
	// - 존재(메모리공간을 차지한다)하는 사물(Object)
	
	
	//2 객체의 기본 구조
	//속성(필드, 멤버 변수) : 객체를 표현하기 위한 단위
	//기능(멤버메서드) : 객체가 수행할 수 있는 Action
	
	
	//3 객체지향이란?
	//현실 세계의 객체의 정보(속성/기능) 중에 필요한 일부만 추출(추상화)하여
	//프로그램에 사용하는데 고안된 문법체계
	
	//나무
	//속성 : 줄기, 뿌리, 잎, 열매...
	//기능 : 광합성하다, 물 흡수하기, 열매맺기
	
	//에어컨
	//속성 : 스텝모터, 필터, 모델명, 모델명...
	//기능 : 온도조절하기, 바람세기조절하기, 바람방향조절하기...
	
	//자동차
	//속성 : 핸들, 제조사명, 차종, 엔진...
	//기능 : 감속하기, 가속하기, 후진하기...
	
	//컴퓨터
	//속성 : CPUSpec, RAMSpec, DISKSpec...
	//기능 : 전원켜기, APP, 웹 서핑...
	
	
	//4 클래스란?(=> 객체를 생성하기 위해 선언된 자료형, 분류)
	//동일한 종류의 객체를 구현하기 위해 객체의 속성/기능을 미리 선언한 자료형
	//클래스는 사용하기 전에는 기본적으로 메모리 공간을 만들지 않는다
	//클래스 자료형에 의해 객체가 생성되는 순간 클래스에서 선언한 속성과 기능대로
	//공간형성이 이루어진다
	
	
	//5 자바의 메모리 영역(객체의 저장 위치 파악)
	//1) 스택영역			: {} 메서드 내에서 사용되는 변수(int, double...)
	//2) 힙영역			: 객체 저장 영역(new 예약어 사용 시 할당) 
	//3) 메서드(클래스)영역   : 공유 메모리 영역(생성자 메서드, 일반 메서드, static 메서드, static 변수)
	
	
	//6 기본코드 해석
//	1)      2)   3)   4)
//	Scanner sc = new Scanner(System.in);
//	
//	1) Scanner		: 클래스 자료형
//	2) sc			: 참조변수
//	3) new			: 힙영역 객체공간 생성
//	4) Scanner()	: 생성자 메서드 -> 객체에 필요한 기본공간 + 초기값 설정
	
	
	
}
