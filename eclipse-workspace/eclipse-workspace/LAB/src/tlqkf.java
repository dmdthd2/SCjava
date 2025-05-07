import java.util.Scanner;

public class tlqkf {

	public static void main(String[] args) {
		int [][]ar= {{0,0,1,0,0},
				{0,1,0,1,0},
		{1,0,2,0,1},
		{0,1,0,1,0},
		{0,0,1,0,0}};
		for(int i =0; i<5; i++) {
			for(int j=0; j<5; j++) {
				switch(ar[i][j]) {
				case 0: System.out.print( " "); break;
				case 1: System.out.print( "*");break;
				case 2: System.out.print( "凸");break;
				}
				
			}
			System.out.println();
//			if(i%5==0&&i!=0) System.out.println();
//			if(ar[i]==0)System.out.print(" ");
//			else System.out.print("*");
		}
		
			
//		System.out.println("*****");
//		System.out.println(" *** ");
//		System.out.println("  *  ");
//		System.out.println(" *** ");
//		System.out.println("*****");
	}
}