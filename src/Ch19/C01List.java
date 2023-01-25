package Ch19;

import java.util.ArrayList;
import java.util.List;

public class C01List {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList();  //업캐스팅, Vector던 LinkedList던 동일한 함수 적용
		
		//추가
		list.add("JAVA");		//0
		list.add("JDBC");		//1
		list.add("OracleDB");	//2
		list.add("JSP");		//3
		list.add("Servlet");	//4
		list.add("JSP");		//5, 중복된 값이 들어가더라도 문제없음 (중복 가능)
		//확인(저장 수)
		System.out.println("총 개체수 : " + list.size());
		//조회(요소)
		System.out.println("확인 idx 2 : " + list.get(2));
		System.out.println("----------------------");
		//전체 조회
		for (String i : list) {
			System.out.println(i);
		}
		//for (int i = 0; i < list.size(); i++) {
		//	System.out.println(list.get(i)); }
		
		//삭제
		list.remove(2);
		System.out.println("---------------------------");
		//전체 조회
		for(String i : list) {
			System.out.println(i);
		}
		//전체 삭제
		list.clear();
		
		
		
	}

}
