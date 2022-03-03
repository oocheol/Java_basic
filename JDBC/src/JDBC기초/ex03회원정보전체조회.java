package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex03회원정보전체조회 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// 목표
		// 모든 회원의 정보가 출력! --> sql문을 작성해야할까?
		// select * from aimember
		// aimember 테이블에 저장되어있는 모든 데이터 출력!!
		// 출력양식(ex)
		// 아이디 이름 나이
		// dnsql456 김운비 20
		// jy123 손지영 20
		// unbi 김운비 20

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from aimember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			System.out.println("아이디\t 이름\t나이");
			while (rs.next()) {
				// 데이터가 없다면 rs.next()가 false > 반복문 종료!
				
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				if (id.length() >= 8) {
					System.out.println(id + " " + name + "\t" + age);
				} else {
					System.out.println(id + "\t " + name + "\t" + age);
				}

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
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
