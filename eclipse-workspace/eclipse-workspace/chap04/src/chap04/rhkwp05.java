package chap04;

import java.util.Scanner;

public class rhkwp05 {

	public static void main(String[] args) {
		// 사용자로부터 크기 len을 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.print("정사각형의 크기를 입력하세요: ");
        int len = scanner.nextInt();  

        int num = 1;  // 숫자는 1부터 시작

        // 정사각형 출력
        for (int i = 1; i <= len; i++) {
            for (int j = 1; j <= len; j++) {
                // 바깥쪽은 별 출력
                if (i == 1 || i == len || j == 1 || j == len) {
                    System.out.print("*");
                } else {
                    // 안쪽은 숫자 출력
                    System.out.print(num);
                    num++;  // 숫자는 증가
                    if (num > 9) num = 1;  // 9까지 출력하고 다시 1로 돌아가기
                }
            }
            System.out.println();  // 한 줄이 끝나면 줄 바꿈
        }
    }
}