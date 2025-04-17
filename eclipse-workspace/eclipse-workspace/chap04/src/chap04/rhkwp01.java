package chap04;

import java.util.Scanner;

public class rhkwp01 {

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
	        System.out.print("길이: ");
	        
	        int len = s.nextInt();
	        
	        // i는 삼각형의 줄을 나타냄
	        for (int i = 0; i < len; i++) {
	            // 공백을 출력 (각 줄마다 공백의 개수가 줄어듦)
	            for (int j = 0; j < len - i - 1; j++) {
	                System.out.print(" ");
	            }
	            
	            // 별을 출력 (각 줄마다 별의 개수가 증가)
	            for (int j = 0; j < 2 * i + 1; j++) {
	                System.out.print("*");
	            }
	            
	            // 줄바꿈
	            System.out.println();
	        }
	    }
	}