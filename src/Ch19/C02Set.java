package Ch19;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class C02Set {

	
	public static void main(String[] args) {
		Set<String> set = new HashSet();  //hashcode(), equals() 이용하여 동일객체여부 판단
		
		//추가
		set.add("JAVA");		//0
		set.add("JDBC");		//1
		set.add("OracleDB");	//2
		set.add("JSP");			//3
		set.add("Servlet");		//4
		set.add("JSP");			//5 나중에 저장되는 값 적용 (디폴트)
		//확인(저장 수)
		System.out.println("총 개체수 : " + set.size());
		//조회 (쉬운 방법)
		for(String tmp : set) {
			System.out.println(tmp);
		}
		System.out.println("-------------------");
		//조회 (복잡한 방법)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext()) {
			String tmp = iter.next();
			System.out.println(tmp);
		}
		System.out.println("-------------------");
		//삭제
		set.remove("JAVA");
		System.out.println("총 개체수 : "+ set.size());
	}

}
