package chap04;

import java.util.Scanner;

public class rhkwp04 {

	public static void main(String[] args) {
		// 사용자로부터 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("다이아몬드 모양 크기를 입력하세요: ");
        int len = scanner.nextInt();  
        
        // 위쪽 삼각형 만들기
        for (int i = 1; i <= len; i++) {
            // 공백 출력
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }
            // 별 출력 (가장자리만 별)
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {  // 첫 번째와 마지막 별만 출력
                    System.out.print("*");
                } else {
                    System.out.print(" ");  // 내부는 공백
                }
            }
            System.out.println();
        }

        // 아래쪽 삼각형 만들기
        for (int i = len - 1; i >= 1; i--) {
            // 공백 출력
            for (int j = 1; j <= len - i; j++) {
                System.out.print(" ");
            }
            // 별 출력 (가장자리만 별)
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k == 1 || k == 2 * i - 1) {  // 첫 번째와 마지막 별만 출력
                    System.out.print("*");
                } else {
                    System.out.print(" ");  // 내부는 공백
                }
            }
            System.out.println();
        }
    }
}