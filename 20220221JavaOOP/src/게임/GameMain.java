package ����;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Pokemon pairi = new Pokemon("��", "���̸�", 1000, "ȭ�����", 100);
		Pokemon kkobuk = new Pokemon("��", "���α�", 1500, "������", 200);

		// ���̸��� ��ų�� ������ּ���.
		// System.out.println(pairi.getSkill());

		int count = 1;
		while (true) {
			if (pairi.getHp() <= 0) {
				System.out.println("�ڡڡڡڲ��α� �¸� !!�ڡڡڡ�");
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			} else if (kkobuk.getHp() <= 0) {
				System.out.println("�ڡڡڡ����̸� �¸� !!�ڡڡڡ�");
				System.out.println("������ ����Ǿ����ϴ�.");
				break;
			}

			System.out.println("******"+count + "��° ���� ******");
			System.out.println("======���ϸ��� �����ϼ���======");
			System.out.println("[1]���̸� [2]���α�");
			// ����ڷκ��� �Է¹ޱ�
			int input = sc.nextInt();
			if (input == 1) {
				// ���̸� ����
				// ���̸��� ���α� ����
				System.out.println("[1]�Ϲݰ��� [2]��ų");
				// ����ڷκ��� �Է¹ޱ�
				int input2 = sc.nextInt();

				if (input2 == 1) {
					// 1. �Ϲݰ����� �����ߴٸ� ���α��� ü���� ���̸��� ���ݷ¸�ŭ ����
					kkobuk.setHp(kkobuk.getHp() - pairi.getAttack());
					System.out.println("���� ���α��� ü�� : " + kkobuk.getHp() +
							"(-" + (int)pairi.getAttack() + ")");

				} else if (input2 == 2) {
					// 2. ��ų������ �����ߴٸ� ���α��� ü���� ���̸��� ���ݷ�*1.5�踸ŭ ����
					kkobuk.setHp(kkobuk.getHp() - (int) (pairi.getAttack() * 1.5));
					System.out.println("���� ���α��� ü�� : " + kkobuk.getHp() +
							"(-" + (int)(pairi.getAttack()*1.5) + ")");
				}

			} else if (input == 2) {
				// ���α� ����
				// ���αⰡ ���̸� ����
				System.out.println("[1]�Ϲݰ��� [2]��ų");
				// ����ڷκ��� �Է¹ޱ�
				int input2 = sc.nextInt();
				if (input2 == 1) {
					// 1. �Ϲݰ����� �����ߴٸ� ���̸��� ü���� ���α��� ���ݷ¸�ŭ ����
					pairi.setHp(pairi.getHp() - kkobuk.getAttack());
					System.out.println("���� ���̸��� ü�� : " + pairi.getHp() +
							"(-" + (int)kkobuk.getAttack() + ")");

				} else if (input2 == 2) {
					// 2. ��ų������ �����ߴٸ� ���̸��� ü���� ���α��� ���ݷ�*1.5�踸ŭ ����
					pairi.setHp(pairi.getHp() - (int) (kkobuk.getAttack() * 1.5));
					System.out.println("���� ���̸��� ü�� : " + pairi.getHp() +
							"(-" + (int)(kkobuk.getAttack()*1.5) + ")");
				}

			}

			count++;
		}
		// 3. �� �� �Ѹ����� ���ϸ��� hp�� 0���� �۰ų� ���������� ������ �ݺ�!
		// �ѹ� ������ �ϰ� ���� �ٽ� ���ϸ� �������� �̵��ϰԲ� �����ؾ���!
		// �߰��߰� ��¹��� �����Ӱ�
		// ex) ���̸��� ü�� : 1500

	}

}
