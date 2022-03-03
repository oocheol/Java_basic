package JDBC����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ex02�α��� {

	public static void main(String[] args) {
		Connection conn = null; // try�����ȿ��� ����Ǹ� ���������� �Ǳ⶧����!!!
		PreparedStatement psmt = null;
		ResultSet rs = null;
		// finally ������ ��� ���ؼ� �� ���� ���� �۾��� �����ߴ�.

		Scanner sc = new Scanner(System.in);

		// �α��� �� �ʿ��� ������?
		// id, pw
		// �Է¹��� �� �ְ� �ڵ� �ۼ�
		System.out.print("ID �Է� >> ");
		String id = sc.next();
		System.out.print("PW �Է� >> ");
		String pw = sc.next();

		// JDBC����!!
		// ����ڰ� �Է��� �����Ͱ� ���� ���̺� �����ϴ��� Ȯ��!

		// 1. �����ͺ��̽� ����
		// 1-1) ����̹� �����ε�
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// exception -> try-catch�� �������ϴ� ����??
			// throws�� ������ try-catch�� �������Ѵ�.

			// 1-2) �����ͺ��̽� ����
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";

			conn = DriverManager.getConnection(url, user, password);

			// 2. Query�� ����
			// 2-1) SQL�� �ۼ�
			String sql = "select * from aimember where id = ? and pw = ?";
			// *(�ƽ�Ÿ��ī) �ǹ̴�? ---> ��ü �÷�!!!

			// 2-2) SQL�� �԰ݿ� �°� ����ֱ�!
			psmt = conn.prepareStatement(sql);

			// 2-3) ?���� ä���ֱ�!
			psmt.setString(1, id);
			psmt.setString(2, pw);

			// 2-4) SQL���� �����ϱ�
			// executeQuery --> select������ ����� �� ���� �޼ҵ�!
			// executeUpdate
			// --> insert, update, delete ���̺�
			// �����͸� ��ȭ��Ű�� ������ ����� �� ���� �޼ҵ�!
			rs = psmt.executeQuery();
			// ResultSet
			// -> ���̺�� ���� ����!
			// -> cursor��� �ϴ� �ָ� ������ �ִ�!
			// -> cursor�� ó���� column���� ����Ű�� �ִ�!
			// -> ���ϴ� �����͸� �������� ���ؼ���
			// cursor�� ����Ű�� �ִ� �࿡ ���ؼ��� �����͸� ������ �� �ִ�.

			// 3. ����� �̿��� �۾�ó��
			if (rs.next()) {
				// rs.next() --> cursor�� ������ġ���� ��ĭ �����ִ� �޼ҵ�
				// �����Ͱ� �����Ѵ�! �α��� ����!
				System.out.println("�α��� ����!");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				System.out.println("�̸� : " + name + "\t���� : " + age);

			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			// �����ͺ��̽� �ڿ� �ݳ�
			// rs, psmt, conn --> ������ ������ �������� �ݳ�����!!!
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
