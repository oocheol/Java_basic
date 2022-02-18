package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex22 {

	public static void main(String args[]) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";
        
        // split() 함수 사용
        
        String[] score_s = score.split(",");
        
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int f = 0;
        
        for(int i=0;i<score_s.length;i++) {
        	if(score_s[i].equals("A")) {
        		a++;
        	} else if(score_s[i].equals("B")) {
        		b++;
        	} else if(score_s[i].equals("C")) {
        		c++;
        	} else if(score_s[i].equals("D")) {
        		d++;
        	} else {
        		f++;
        	}
        }
        
        System.out.println("A : " + a + "명");
        System.out.println("B : " + b + "명");
        System.out.println("C : " + c + "명");
        System.out.println("D : " + d + "명");
        System.out.println("F : " + f + "명");
		
	}

}
