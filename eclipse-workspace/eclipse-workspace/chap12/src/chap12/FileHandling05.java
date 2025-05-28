package chap12;

import java.io.File;
import java.io.FileReader;

public class FileHandling05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

		File file =new File("member.txt");
		FileReader fr =new FileReader(file);
		int i =0;
		 while((i=fr.read())!=-1) {
			 System.out.print((char)i);
		 }
		 fr.close();
		 System.out.print("파일 읽기 성공!");
		}catch(Exception e) {
			e.getMessage();
		}
	}

}
