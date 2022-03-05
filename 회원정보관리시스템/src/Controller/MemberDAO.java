package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.MemberDTO;

public class MemberDAO {
	// DAO
	// DataBase Access Object
	// �����ͺ��̽��� ���õ� ��� ����� ����ϴ� ����!
	// 1. �ʵ�
	// -> �����ͺ��̽� ����� ���õ� �ڿ����� ����!
	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	// �����ͺ��̽� ���� �޼ҵ�
	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "hr";
			String password = "hr";
			conn = DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	// �����ͺ��̽� �ڿ� �ݳ� �޼ҵ�
	private void getClose() {
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

	// 2. �޼ҵ� (��ɵ��� �и�)
	// �α��� -> MainŬ�������� ����ؾ��ϴ� �޼ҵ�!
	public MemberDTO login(MemberDTO dto) {
		try {
			getConn();

			String sql = "select * from aimember where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();
			if (rs.next()) {
				String name = rs.getString("name");
				int age = rs.getInt("age");
				dto.setName(name);
				dto.setAge(age);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return dto;

	}

	// ȸ������
	public int join(MemberDTO dto) {
		int row = 0;

		try {
			getConn();

			String sql = "insert into aimember values(?,?,?,?)";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());
			psmt.setInt(4, dto.getAge());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB���� ���� �߻�");

		} finally {
			getClose();
		}
		return row;
	}

	// ��ü��ȸ
	// �޼ҵ�� : view
	public ArrayList<MemberDTO> view() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();

		try {
			getConn();

			String sql = "select * from aimember";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			while (rs.next()) {
				String id = rs.getString("id");
				String name = rs.getString("name");
				int age = rs.getInt("age");
				// id, name, age�� �ϳ��� ��������? ---> dto
				MemberDTO dto = new MemberDTO(id, name, age);
				// -> �Ѹ� ���� ������!
				list.add(dto);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return list;
	}

	public int delete(MemberDTO deleteDTO) {
		int cnt = 0;
		try {
			// 1. �����ͺ��̽� ����
			getConn();
			// 2. Query�� ����
			String sql = "delete aimember where id = ? and pw = ?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setNString(1, deleteDTO.getId());
			psmt.setNString(2, deleteDTO.getPw());

			// delete, insert --> executeUpdate
			cnt = psmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			getClose();
		}
		return cnt;
	}

}
