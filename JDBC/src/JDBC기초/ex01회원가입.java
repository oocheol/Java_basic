package JDBC����;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ex01ȸ������ {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement psmt = null;
		Scanner sc = new Scanner(System.in);
		
		// ȸ�������� ���� �����Ͱ� �� �?
		// -> 4��!(id, pw, name, age) -> ������ �ڷ�����?
		System.out.print("ID �Է� >> ");
		String id = sc.next();
		System.out.print("PW �Է� >> ");
		String pw = sc.next();
		System.out.print("�̸� �Է� >> ");
		String name = sc.next();
		System.out.print("���� �Է� >> ");
		int age = sc.nextInt();
		
		
		
		
		

		// JDBC
		// -> Java DataBase Connectivity
		// -> ������ �������̽���� �ڵ尡 ����!
		// 1. �õ��غ�!
		try {
			// JDBC �������
			// 1. �����ͺ��̽� ����
			// 1-1) ����̹� �����ε�
			// �����ε��̶�?
			// �����ϴ� ���� �ڷ����� �����Ǵ� ��!(OracleDriver �ڷ���!)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// ��︲���� ���� --> static(������ �������)
			// �����ϴ� ������ ���� ���� �ε��Ǵ� ���� = static
			// ��ü�� ������ �������� �ʾƵ� ��� ����
			// ��������� ũ�Ⱑ �ſ� �۴�! �Ժη� ����ϸ� �ȵȴ�!

			// -> � �����ͺ��̽��� ����̹��� �����ð��� �����ִ� �ڵ�!
			// oracle.jdbc.driver --> ��Ű����
			// OracleDriver --> Ŭ������
			
			// ClassNotFoundException(Ŭ������ ã�� ������ ���� ����)
			// - ojdbc6.jar ������ ������Ʈ�� �߰��ߴ��� Ȯ���ϱ�
			// - forName�ȿ� �Ű������� ��Ÿ�� ������ ������!
			
			
			// 1-2) �����ͺ��̽� ����
			// �����ϱ� ���� �غ񹰵�!
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // �����ͺ��̽� �ּ�
			// jdbc:oracle:thin --> ����Ŭ�� thin ����̹�
			// @localhost --> ip�ּ� (�� ��ǻ�� ip�ּҸ� ���ϴ� Ű����)
			// ex) �ٸ� ��ǻ�� ���� > localhost�� �ش� ip�ּҷ� ����
			// 1521 --> ��Ʈ ��ȣ
			// xe --> DB�̸�
			String user = "hr"; // �����ͺ��̽� ����
			String password = "hr"; // ��й�ȣ
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 2. Query��(SQL) ����
			// 2-1) SQL���� �غ��ϱ�
			String sql = "insert into aimember values(?,?,?,?)";
			
			// 2-2) SQL�� ����
			psmt = conn.prepareStatement(sql);
			// --> SQL������ ��Ŀ� �°� ����ִ� �۾�
			
			// ?���ڸ� ä���ִ� �۾�(����ڰ� �Է��� �����ͷ�)
			// ���⼭ Index�� 1���� ����(0���� X) 
			psmt.setString(1, id);
			psmt.setString(2, pw);
			psmt.setString(3, name);
			psmt.setInt(4, age);
			// �����ϱ� ���� ?���ڸ� ���� ä���ֱ�!!!!!!!!
			
			
			
			int row = psmt.executeUpdate();
			// SQL�� ���� -> ������ ���� ���� ������ ����� �޾ƿ�!
			
			// 3. ����� �̿��� �۾�ó��
			if (row > 0) {
				System.out.println("������ �߰� ����!");
			} else {
				System.out.println("������ �߰� ����!");
			}
			
			// Exception = ClassNotFoundException
			// Exception = SQLException		
			// catch(Exception e){
			// ���ܹ߻��� ~~~ }
			// ��� ���ܿ� ���õ� Ŭ������ Exception Ŭ������ ��ӹ޴´�.
			
		} catch (ClassNotFoundException e) {
			// catch(������ Ŭ������ ������(e))
			// 2. ���ܻ�Ȳ�� �߻��ϸ� ���� ����ٰ�!!!
			e.printStackTrace(); // -> ������ �� ����ϴ� �ڵ�
			System.out.println("������ �߻��߽��ϴ�.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB���� ���� �߻�");
			
		} finally {
			try {
				// �׻� �ڿ��� �ݳ��� ���� ������ ������ ������ �ݳ�����!
				if (psmt != null) // ctrl + f�� ã�� ����!
					psmt.close();
				
				if (conn != null) // if ���๮���� �����̸� �߰�ȣ ���� ����!
					conn.close();
				
				
				
				
				
				
				
				
				
				
				
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("�ڿ��ݳ��� ����");
			}
		}
		
		
		// 1-2) �����ͺ��̽� ����
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
