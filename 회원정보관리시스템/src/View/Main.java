package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import Controller.MemberDAO;
import Model.MemberDTO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// 데이터베이스 연결과 관련된 도구 생성
		MemberDAO dao = new MemberDAO();

		System.out.println("========회원정보관리시스템=========");

		boolean stop = true;
		while (stop) {
			System.out.print("[1]로그인 [2]회원가입 [3]전체조회 [4]회원정보삭제 [5]종료 >> ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("==========로그인===========");

				System.out.print("ID 입력 >> ");
				String id = sc.next();
				System.out.print("PW 입력 >> ");
				String pw = sc.next();

				MemberDTO loginDTO = new MemberDTO(id, pw);

				// 로그인 기능 수행

				MemberDTO resultDTO = dao.login(loginDTO);

				if (resultDTO.getName() != null) {
					System.out.println("로그인 성공");
					System.out.println("이름 : " + resultDTO.getName() + "\t나이 : " + resultDTO.getAge());
				} else {
					System.out.println("로그인 실패~!~!");
				}
				break;
			case 2:
				System.out.println("==========회원가입===========");

				System.out.print("ID 입력 >> ");
				id = sc.next();
				System.out.print("PW 입력 >> ");
				pw = sc.next();
				System.out.print("이름 입력 >> ");
				String name = sc.next();
				System.out.print("나이 입력 >> ");
				int age = sc.nextInt();

				// id, pw, name, age를 하나의 자료형으로 묶자
				MemberDTO dto = new MemberDTO(id, pw, name, age);

				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("회원가입 성공!");
				} else {
					System.out.println("회원가입 실패!");
				}

				break;
			case 3:
				System.out.println("==========전체조회==========");

				ArrayList<MemberDTO> resultList = dao.view();
				System.out.println("아이디\t 이름\t나이");

//				for (int i = 0; i< resultList.size();i++) {
//					if (resultList.get(i).getId().length() >= 8) {
//						System.out.println(resultList.get(i).getId() + " " 
//					+ resultList.get(i).getName() + "\t" 
//					+ resultList.get(i).getAge());
//					} else {
//						System.out.println(resultList.get(i).getId() + "\t " 
//					+ resultList.get(i).getName() + "\t" 
//					+ resultList.get(i).getAge());
//					}	
//				}

				// for-each문
				for (MemberDTO temp : resultList) {
					System.out.println(temp);
				}

				break;
			case 4:
				System.out.println("==========회원정보삭제==========");
				// 아이디랑 패스워드 --> 일치하는 데이터만 삭제!
				System.out.print("ID 입력 >> ");
				id = sc.next();
				System.out.print("PW 입력 >> ");
				pw = sc.next();

				// 데이터베이스 안에 있는 데이터를 지우기! -> DAO 사용!
				// DAO에 넘겨줄 수 있는 데이터 양식 -> MemberDTO
				MemberDTO deleteDTO = new MemberDTO(id, pw);
				int cnt = dao.delete(deleteDTO);

				if (cnt > 0) {
					System.out.println("회원정보 삭제 성공!!");
				} else {
					System.out.println("회원정보 삭제 실패!!");
				}

				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				stop = false;

				break;
			default:
				System.out.println("잘못된 숫자를 입력하셨습니다.");

			}

		}

	}

}
