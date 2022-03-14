package Question6_2;

import java.util.ArrayList;
import java.util.Scanner;

import Question6_1.MusicVO;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		ArrayList<MusicVO> list = new ArrayList<MusicVO>();
		
		boolean stop = true;
		
		while(stop) {
		System.out.print("[1]음식점보기 [2]미용실보기 [3]상세보기 [4]평점보기 [5]종료 >> ");
		int input = sc.nextInt();
		switch(input) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			break;
		case 4:
			break;
		case 5:
			stop = false;
			break;
		default:
				System.out.println("정확한 숫자를 입력해주세요.");
			} 
		}
		
	}

}
