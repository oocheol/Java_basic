package Java_Festival;

import java.util.Random;
import java.util.Scanner;

public class Ex22 {

	public static void main(String args[]) {
        String score = "A,A,B,C,D,A,C,D,D,D,F";
        
        // split() �Լ� ���
        
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
        
        System.out.println("A : " + a + "��");
        System.out.println("B : " + b + "��");
        System.out.println("C : " + c + "��");
        System.out.println("D : " + d + "��");
        System.out.println("F : " + f + "��");
		
	}

}
