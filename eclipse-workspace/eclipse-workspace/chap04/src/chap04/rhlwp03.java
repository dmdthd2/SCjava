package chap04;

import java.util.Scanner;

public class rhlwp03 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        System.out.print("길이: ");
        
        int len = s.nextInt();
        
        // 뒤집은 직각삼각형 모양을 그리기 위한 반복문
        for (int i = 1; i <= len; i++) {
            // 공백을 출력 (각 줄마다 공백의 개수가 점점 감소)
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" "); // 공백 출력
            }
            // 별(*)을 출력 (각 줄마다 i개의 별을 출력)
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // 별 출력
            }
            // 줄바꿈
            System.out.println();
        }
    }
}