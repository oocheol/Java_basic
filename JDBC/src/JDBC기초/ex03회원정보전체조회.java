package JDBC����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ex03ȸ��������ü��ȸ {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		ResultSet rs = null;

		// ��ǥ
		// ��� ȸ���� ������ ���! --> sql���� �ۼ��ؾ��ұ�?
		// select * from aimember
		// aimember ���̺� ����Ǿ��ִ� ��� ������ ���!!
		// ��¾��(ex)
		// ���̵� �̸� ����
		// dnsql456 ���� 20
		// jy123 ������ 20
		// unbi ���� 20

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			String sql = "select * from aimember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();
			System.out.println("���̵�\t �̸�\t����");
			while (rs.next()) {
				// �����Ͱ� ���ٸ� rs.next()�� false > �ݺ��� ����!
				
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
