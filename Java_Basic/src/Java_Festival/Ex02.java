package Java_Festival;

import java.io.*;
import java.util.Scanner;
// import elice.EliceUtils;

public class Ex02 {
	public static void main(String args[]) {
        
        System.out.print("�ѱݾ� �Է� : ");
        Scanner sc = new Scanner(System.in);
        int change = sc.nextInt();
        System.out.println("�ܵ� : " + change + "��");
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
        
        
        System.out.println("10000�� : " + ex_10000 + "��");
        System.out.println("5000�� : " + ex_5000 + "��");
        System.out.println("1000�� : " + ex_1000 + "��");
        System.out.println("500�� : " + ex_500 + "��");
        System.out.println("100�� : " + ex_100 + "��");

        
	}
}
