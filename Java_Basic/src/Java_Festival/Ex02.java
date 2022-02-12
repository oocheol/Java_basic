package Java_Festival;

import java.io.*;
import java.util.Scanner;
// import elice.EliceUtils;

public class Ex02 {
	public static void main(String args[]) {
        
        System.out.print("총금액 입력 : ");
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        System.out.println("잔돈 : " + change + "원");
        int ex_10000 = change / 10000;
        change %= 10000;
        int ex_5000 = change / 5000;
        change %= 5000;
        int ex_1000 = change / 1000;
        change %= 1000;
        int ex_500 = change / 500;
        change %= 500;
        int ex_100 = change / 100;
        change %= 100;
        
        
        System.out.println("10000원 : " + ex_10000 + "개");
        System.out.println("5000원 : " + ex_5000 + "개");
        System.out.println("1000원 : " + ex_1000 + "개");
        System.out.println("500원 : " + ex_500 + "개");
        System.out.println("100원 : " + ex_100 + "개");

        
	}
}
