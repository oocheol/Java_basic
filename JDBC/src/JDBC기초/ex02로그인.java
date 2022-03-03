package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex02로그인 {

	public static void main(String[] args) {
		Connection conn = null; // try구문안에서 선언되면 지역변수가 되기때문에!!!
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// finally 구문에 닿기 위해서 맨 위로 빼는 작업을 진행했다.

		Scanner sc = new Scanner(System.in);

		// 로그인 시 필요한 데이터?
		// id, pw
		// 입력받을 수 있게 코드 작성
		System.out.print("ID 입력 >> ");
		String id = sc.next();
		System.out.print("PW 입력 >> ");
		String pw = sc.next();

		// JDBC시작!!
		// 사용자가 입력한 데이터가 실제 테이블에 존재하는지 확인!

		// 1. 데이터베이스 연결
		// 1-1) 드라이버 동적로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// exception -> try-catch로 잡아줘야하는 이유??
			// throws로 던지면 try-catch로 잡아줘야한다.

			// 1-2) 데이터베이스 연결
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			// 2. Query문 전송
			// 2-1) SQL문 작성
			String sql = "select * from aimember where id = ? and pw = ?";
			// *(아스타리카) 의미는? ---> 전체 컬럼!!!

			// 2-2) SQL문 규격에 맞게 담아주기!
			psmt = conn.prepareStatement(sql);

			// 2-3) ?인자 채워주기!
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 2-4) SQL문장 전송하기
			// executeQuery --> select구문을 사용할 때 쓰는 메소드!
			// executeUpdate
			// --> insert, update, delete 테이블에
			// 데이터를 변화시키는 구문을 사용할 때 쓰는 메소드!
			rs = psmt.executeQuery();
			// ResultSet
			// -> 테이블과 같은 형태!
			// -> cursor라고 하는 애를 가지고 있다!
			// -> cursor는 처음에 column명을 가리키고 있다!
			// -> 원하는 데이터를 가져오기 위해서는
			// cursor가 가리키고 있는 행에 대해서만 데이터를 가져올 수 있다.

			// 3. 결과를 이용한 작업처리
			if (rs.next()) {
				// rs.next() --> cursor를 현재위치에서 한칸 내려주는 메소드
				// 데이터가 존재한다! 로그인 성공!
				System.out.println("로그인 성공!");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("이름 : " + name + "\t나이 : " + age);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// 데이터베이스 자원 반납
			// rs, psmt, conn --> 열어준 순서의 역순으로 반납하자!!!
			try {
				if (rs != null)
					rs.close();
				if (psmt != null)
					psmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}
