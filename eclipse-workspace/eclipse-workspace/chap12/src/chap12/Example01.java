package chap12;

import java.io.File;

public class Example01 {

	public static void main(String[] args) {
		File fo = new File("Example01.txt");
		try {
			boolean success=fo.createNewFile();
			if(success) {
				System.out.println("파일 생성 성공");
			}else {
				System.out.println("파일 생성 실패");
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
