package chap04;

import java.util.Scanner;

public class rhkwp02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("길이: ");
        
        int len = s.nextInt(); // 높이를 입력받음
        
        // 직각삼각형 모양을 그리기 위한 반복문
        for (int i = 1; i <= len; i++) {
            // 별(*)을 출력 (i개의 별 출력)
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            
            // 줄바꿈
            System.out.println();
        }
    }
}