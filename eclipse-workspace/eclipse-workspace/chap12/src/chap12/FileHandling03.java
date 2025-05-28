package chap12;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileHandling03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("member.txt");
		try {
			if(!file.exists())
				file.createNewFile();
				
			FileWriter fw = new FileWriter(file);
			Scanner sc = new Scanner(System.in);
			
			boolean quit =false;
			while(!quit) {
				System.out.println("아이디: ");
				String userID = sc.next();
				fw.write("아이디: "+userID+ " ");
				System.out.println("이름: ");
				String userName = sc.next();
				fw.write("아이디: "+userName+ "\n");
				System.out.println("계속 진행? Y|N");
				sc=new Scanner(System.in);
				String str =sc.nextLine();
				if(str.toUpperCase().equals("N"))
					quit=true;
			}
			fw.close();
			System.out.println("파일쓰기 성공");
			}catch(Exception e) {
				e.getMessage();
			
				
			
			}
		
		
	

}
}