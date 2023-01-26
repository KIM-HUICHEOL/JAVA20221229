package Ch20;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class C02Insert {

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
		pstmt = conn.prepareStatement("INSERT INTO `testdb`.`tbl_std` (`id`, `name`, `addr`) VALUES (?, ?, ?);");
		System.out.print("번호, 이름, 주소 순 입력 > ");
		int sid = sc.nextInt();
		String name = sc.next();
		String addr = sc.next();
		
		pstmt.setInt(1, sid);				//첫번째 ? 에 들어갈 값 지정
		pstmt.setString(2, name);			//두번째 ? 에 들어갈 값 지정 
		pstmt.setString(3, addr);			//세번째 ? 에 들어갈 값 지정
		
		//4 SQL 쿼리 전송(추가, 수정, 삭제 -> executeUpdate)
		int result = pstmt.executeUpdate();
	
		if (result>0) {
			System.out.println("INSERT 성공!");
		}
		else {
			System.out.println("INSERT 실패!");
		}
		
		
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {conn.close();}catch(Exception e) {e.printStackTrace();}
		}
	}

}
