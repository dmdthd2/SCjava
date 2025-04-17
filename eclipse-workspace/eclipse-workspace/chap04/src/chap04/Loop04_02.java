package chap04;

import java.util.Scanner;

public class Loop04_02 {

	public static void main(String[] args) {
		int len;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("라인 수 입력: ");
        len = scan.nextInt();
        
        for(int i = 0; i < len; i++) {
        	if(i == 0 || i == len -1) {
        	for(int j = 0; j < len; j++) {
        		System.out.print("*");
        	}
        	}
        	else {
        			for(int k = 0; k < len; k++) {
        				if(k == 0 || k == len-1 || i + k == len - 1)
        					System.out.print("*");
        				else 
        					System.out.print(" ");
        			}
        		}
        	System.out.println();
        	}
	}
}