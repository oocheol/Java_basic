package Question6_1;

import java.util.ArrayList;
import java.util.Scanner;

public class MusicPlayer {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		MusicController con = new MusicController();
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		
		boolean stop = true; 
		
		while(stop) {
		System.out.println("===�����÷��̾�===");
		System.out.print("1.��� 2.��� 3.���� 4.������ 5.������ 6.���� >> ");
		int input = sc.nextInt();


		switch(input) {
		case 1:
			System.out.println("===���===");
			System.out.print("���� : ");
			String title = sc.next();
			System.out.print("���� : ");
			String singer = sc.next();
			System.out.print("�ð� : ");
			int playTime = sc.nextInt();
			
			list.add(new MusicVO(title, singer, playTime));
			
			break;
		case 2:
			System.out.println("===�뷡���===");
			for(int i=0;i<list.size();i++) {
			System.out.print("���� : " + list.get(i).getTitle() + "\t ");
			System.out.print("���� : " + list.get(i).getSinger() + "\t ");
			System.out.println("�ð� : " + list.get(i).getPlayTime());
			
			}
			
			
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			stop = false;
			break;
		default :
			System.out.println("��Ȯ�� ���ڸ� �Է����ּ���.");			
			
		}
		
		}
		
	}
	
}
