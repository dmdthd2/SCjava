package chap12;

import java.io.File;
import java.io.FileWriter;

public class Example03 {

	public static void main(String[] args) {
		try {
			File file =new File("example03.txt");
			if(!file.exists())
				file.createNewFile();
			FileWriter mywriter= new FileWriter(file);
			
			mywriter.write("Hello \n");
			mywriter.write("Java Programming!");
			mywriter.close();
			
			System.out.println("파일쓰기 성공~");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
