package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ex01회원가입 {

	public static void main(String[] args) {
		Connection conn = null;

		// JDBC
		// -> Java DataBase Connectivity
		// -> 수많은 인터페이스들로 코드가 구성!
		// 1. 시도해봐!
		try {
			// JDBC 연결과정
			// 1. 데이터베이스 연결
			// 1-1) 드라이버 동적로딩
			// 동적로딩이란?
			// 실행하는 순간 자료형이 결정되는 것!(OracleDriver 자료형!)
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 기울림꼴의 형태 --> static(정적인 저장공간)
			// 실행하는 순간에 가장 먼저 로딩되는 순간 = static
			// 객체를 별도로 생성하지 않아도 사용 가능
			// 저장공간의 크기가 매우 작다! 함부로 사용하면 안된다!

			// -> 어떤 데이터베이스의 드라이버를 가져올건지 정해주는 코드!
			// oracle.jdbc.driver --> 패키지명
			// OracleDriver --> 클래스명
			
			// ClassNotFoundException(클래스를 찾지 못했을 때의 예외)
			// - ojdbc6.jar 파일을 프로젝트에 추가했는지 확인하기
			// - forName안에 매개변수에 오타가 있지는 않은지!
			
			
			// 1-2) 데이터베이스 연결
			// 연결하기 위한 준비물들!
			String url = "jdbc:oracle:thin:@localhost:1521:xe"; // 데이터베이스 주소
			// jdbc:oracle:thin --> 오라클의 thin 드라이버
			// @localhost --> ip주소 (내 컴퓨터 ip주소를 뜻하는 키워드)
			// ex) 다른 컴퓨터 접속 > localhost를 해당 ip주소로 변경
			// 1521 --> 포트 번호
			// xe --> DB이름
			String user = "hr"; // 데이터베이스 계정
			String password = "hr"; // 비밀번호
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 2. Query문(SQL) 전송
			// 2-1) SQL문장 준비하기
			String sql = "insert into aimember values('jy123','12345','손지영',20)";
			
			// 2-2) SQL문 전송
			PreparedStatement psmt = conn.prepareStatement(sql);
			// --> SQL구문을 양식에 맞게 담아주는 작업
			int row = psmt.executeUpdate();
			// SQL문 전송 -> 영향을 받은 행의 갯수로 결과를 받아옴!
			
			// 3. 결과를 이용한 작업처리
			if (row > 0) {
				System.out.println("데이터 추가 성공!");
			} else {
				System.out.println("데이터 추가 실패!");
			}
			
			// Exception = ClassNotFoundException
			// Exception = SQLException		
			// catch(Exception e){
			// 예외발생시 ~~~ }
			// 모든 예외와 관련된 클래스는 Exception 클래스를 상속받는다.
			
		} catch (ClassNotFoundException e) {
			// catch(예외의 클래스명 변수명(e))
			// 2. 예외상황이 발생하면 내가 잡아줄게!!!
			e.printStackTrace(); // -> 개발할 때 사용하는 코드
			System.out.println("오류가 발생했습니다.");
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("DB관련 오류 발생");
			
		} finally {
			try {
				if (conn != null) // if 실행문장이 한줄이면 중괄호 생략 가능!
					conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("자원반납시 오류");
			}
		}
		
		
		// 1-2) 데이터베이스 연결
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
