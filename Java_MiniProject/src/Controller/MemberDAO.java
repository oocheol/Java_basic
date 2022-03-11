package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import Model.MemberDTO;
import Model.QuizDTO;

public class MemberDAO {

	private Connection conn = null;
	private PreparedStatement psmt = null;
	private ResultSet rs = null;

	private void getConn() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@project-db-stu.ddns.net:1524:xe";
			String user = "cgi_6_0310_2";
			String password = "smhrd2";
			conn = DriverManager.getConnection(url, user, password);

		} catch (ClassNotFoundException e) {
			System.out.println("ClassNotFound Exception");
		} catch (SQLException e) {
			System.out.println("SQL 관련 오류 발생!");
		}
	}

	private void getClose() {
		try {
			if (rs != null)
				rs.close();
			if (psmt != null)
				psmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("SQL 관련 오류 발생!");
		}
	}

	public MemberDTO login(MemberDTO dto) {
		try {
			getConn();
			String sql = "select * from member where id = ? and pw = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());

			rs = psmt.executeQuery();

			if (rs.next()) {
				String name = rs.getString("nick");
				dto.setName(name);
			}
		} catch (SQLException e) {
			System.out.println("SQL 관련 오류 발생!");
		} finally {
			getClose();
		}
		return dto;

	}

	public int join(MemberDTO dto) {
		int row = 0;

		try {
			getConn();

			String sql = "insert into member values(?, ?, ?, 0)";

			psmt = conn.prepareStatement(sql);

			psmt.setString(1, dto.getId());
			psmt.setString(2, dto.getPw());
			psmt.setString(3, dto.getName());

			row = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("데이터베이스 관련 오류 발생!");
		} finally {
			getClose();
		}
		return row;
	}
	
	public int scoreUpdate(MemberDTO dto) {
		int row = 0;
		try {
			getConn();

			String sql = "update member set score = ? where id = ?";

			psmt = conn.prepareStatement(sql);

			psmt.setInt(1, dto.getScore());
			psmt.setString(2, dto.getId());
			
			row = psmt.executeUpdate();

		} catch (SQLException e) {
			System.out.println("데이터베이스 관련 오류 발생!");
		} finally {
			getClose();
		}
		return row;
	}
	
	public int getScore(MemberDTO dto) {
		int result = 0;
		try {
			getConn();

			String sql = "select score from member where id = ?";

			psmt = conn.prepareStatement(sql);
			psmt.setString(1, dto.getId());
			
			rs = psmt.executeQuery();


			while (rs.next()) {
				int score = rs.getInt("score");
				result = score;
			}

		} catch (SQLException e) {
			System.out.println("SQL 관련 오류 발생!");
		} finally {
			getClose();
		}
		return result;
	}

	public ArrayList<MemberDTO> view() {
		ArrayList<MemberDTO> list = new ArrayList<MemberDTO>();
		try {
			getConn();

			String sql = "select * from member order by score desc";

			psmt = conn.prepareStatement(sql);

			rs = psmt.executeQuery();

			System.out.println("아이디" + "\t\t닉네임" + "\t\t점수");
			System.out.println("---------------------------------------");

			while (rs.next()) {
				String ID = rs.getString("ID");
				String name = rs.getString("nick");
				int score = rs.getInt("score");
				MemberDTO dto = new MemberDTO(ID, name, score);
				list.add(dto);
			}

		} catch (SQLException e) {
			System.out.println("SQL 관련 오류 발생!");
		} finally {
			getClose();
		}
		return list;
	}
		
		public ArrayList<QuizDTO> quizView() {
			ArrayList<QuizDTO> list = new ArrayList<QuizDTO>();
			try {
				getConn();

				String sql = "select * from quiz";

				psmt = conn.prepareStatement(sql);

				rs = psmt.executeQuery();
				

				while (rs.next()) {
					String question = rs.getString("question");
					String answer = rs.getString("answer");
					String hint = rs.getString("hint");
					String path = rs.getString("mp3");
					QuizDTO dto = new QuizDTO(question, answer, hint, path);
					list.add(dto);
				}

			} catch (SQLException e) {
				System.out.println("SQL 관련 오류 발생!");
			} finally {
				getClose();
			}
			return list;
		

	}

}
