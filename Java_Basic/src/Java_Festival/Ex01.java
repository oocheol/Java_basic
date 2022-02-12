package Java_Festival;

import java.util.Scanner;

public class Ex01 {

		public static void main(String args[]) {
			int pay = 5000;
	        
	        System.out.print("일한시간을 입력하세요 : ");
	        Scanner sc = new Scanner(System.in);
	        
	        int time = sc.nextInt();
	        int result ;
	        if (time > 8){
	            result = (int) ((pay * 8) + (pay * (time-8) * 1.5));
	        } else {
	            result = pay * time;
	        }
	        
	        System.out.println("총 임금은 "+result+"원 입니다.");
		}

}

