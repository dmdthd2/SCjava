package chap11;

import java.util.Scanner;

public class Exception01 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("숫자를 입력하세요");
		int n1=sc.nextInt();
		
		try {
			int n2=10/n1;
			System.out.println(n2);
		}catch(Exception e) {//Exception e 를 하면 모든 예외처리 가능
			System.out.println("다시해라. 0으로 나눌 수 없어.");
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}System.out.println("외부!");

	}

}
