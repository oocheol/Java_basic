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
		// �����ͺ��̽� ����� ���õ� ���� ����
		MemberDAO dao = new MemberDAO();

		System.out.println("========ȸ�����������ý���=========");

		boolean stop = true;
		while (stop) {
			System.out.print("[1]�α��� [2]ȸ������ [3]��ü��ȸ [4]ȸ���������� [5]���� >> ");
			int input = sc.nextInt();
			switch (input) {
			case 1:
				System.out.println("==========�α���===========");

				System.out.print("ID �Է� >> ");
				String id = sc.next();
				System.out.print("PW �Է� >> ");
				String pw = sc.next();

				MemberDTO loginDTO = new MemberDTO(id, pw);

				// �α��� ��� ����

				MemberDTO resultDTO = dao.login(loginDTO);

				if (resultDTO.getName() != null) {
					System.out.println("�α��� ����");
					System.out.println("�̸� : " + resultDTO.getName() + "\t���� : " + resultDTO.getAge());
				} else {
					System.out.println("�α��� ����~!~!");
				}
				break;
			case 2:
				System.out.println("==========ȸ������===========");

				System.out.print("ID �Է� >> ");
				id = sc.next();
				System.out.print("PW �Է� >> ");
				pw = sc.next();
				System.out.print("�̸� �Է� >> ");
				String name = sc.next();
				System.out.print("���� �Է� >> ");
				int age = sc.nextInt();

				// id, pw, name, age�� �ϳ��� �ڷ������� ����
				MemberDTO dto = new MemberDTO(id, pw, name, age);

				int row = dao.join(dto);

				if (row > 0) {
					System.out.println("ȸ������ ����!");
				} else {
					System.out.println("ȸ������ ����!");
				}

				break;
			case 3:
				System.out.println("==========��ü��ȸ==========");

				ArrayList<MemberDTO> resultList = dao.view();
				System.out.println("���̵�\t �̸�\t����");

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

				// for-each��
				for (MemberDTO temp : resultList) {
					System.out.println(temp);
				}

				break;
			case 4:
				System.out.println("==========ȸ����������==========");
				// ���̵�� �н����� --> ��ġ�ϴ� �����͸� ����!
				System.out.print("ID �Է� >> ");
				id = sc.next();
				System.out.print("PW �Է� >> ");
				pw = sc.next();

				// �����ͺ��̽� �ȿ� �ִ� �����͸� �����! -> DAO ���!
				// DAO�� �Ѱ��� �� �ִ� ������ ��� -> MemberDTO
				MemberDTO deleteDTO = new MemberDTO(id, pw);
				int cnt = dao.delete(deleteDTO);

				if (cnt > 0) {
					System.out.println("ȸ������ ���� ����!!");
				} else {
					System.out.println("ȸ������ ���� ����!!");
				}

				break;
			case 5:
				System.out.println("���α׷��� �����մϴ�.");
				stop = false;

				break;
			default:
				System.out.println("�߸��� ���ڸ� �Է��ϼ̽��ϴ�.");

			}

		}

	}

}
