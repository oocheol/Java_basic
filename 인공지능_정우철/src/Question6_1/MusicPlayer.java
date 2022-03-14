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
		System.out.println("===뮤직플레이어===");
		System.out.print("1.등록 2.목록 3.실행 4.이전곡 5.다음곡 6.종료 >> ");
		int input = sc.nextInt();


		switch(input) {
		case 1:
			System.out.println("===등록===");
			System.out.print("제목 : ");
			String title = sc.next();
			System.out.print("가수 : ");
			String singer = sc.next();
			System.out.print("시간 : ");
			int playTime = sc.nextInt();
			
			list.add(new MusicVO(title, singer, playTime));
			
			break;
		case 2:
			System.out.println("===노래목록===");
			for(int i=0;i<list.size();i++) {
			System.out.print("제목 : " + list.get(i).getTitle() + "\t ");
			System.out.print("가수 : " + list.get(i).getSinger() + "\t ");
			System.out.println("시간 : " + list.get(i).getPlayTime());
			
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
			System.out.println("정확한 숫자를 입력해주세요.");			
			
		}
		
		}
		
	}
	
}
