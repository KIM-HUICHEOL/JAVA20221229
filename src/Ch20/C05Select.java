package Ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class C05Select {

	public static void main(String[] args) {
		//연결관련 정보 저장용 변수
		String id = "root";								  //DB연결 id
		String pw = "1234";								  //DB연결 pw
		String url = "jdbc:mysql://localhost/testDB";     //연결URL(DBMS마다 상이함)
		
		//DB연결객체 관련 참조변수
		Connection conn = null;							  //DB연결객체용 참조변수
		PreparedStatement pstmt = null;					  //SQL쿼리 전송객체용 참조변수
		ResultSet rs = null;
		
		
		Scanner sc = new Scanner(System.in);
		try {  //예외처리 시켜줘야 함
		Class.forName("com.mysql.cj.jdbc.Driver");		  //1 드라이브 메모리 적재
		System.out.println("Driver Loading Success!!");
		conn = DriverManager.getConnection(url, id, pw);  //2 DB 연결
		System.out.println("DB Connected...");
		
		//3 SQL 쿼리 객체 받아오기
		pstmt = conn.prepareStatement("select * from tbl_std");  //전체 조회(입력 값 받을 필요 없음)
		
		//4 SQL 쿼리 전송(조회 -> executeQuery)
		rs = pstmt.executeQuery();
		
		//5 결과물 확인
		if (rs!=null) {
			while(rs.next()) {
				System.out.printf("%d %s %s\n", rs.getInt("id"), rs.getString("name"), rs.getString("addr"));
			}
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {conn.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
