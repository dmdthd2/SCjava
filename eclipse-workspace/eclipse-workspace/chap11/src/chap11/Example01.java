package chap11;

public class Example01 {

	public static void main(String[] args) {
			 try { 
			     int a = 0;
			      int b = 5/a;
			      System.out.println(b);
			 }  
			 catch(ArithmeticException e) { 
			      System.out.println("0으로 나눕니다."); 
			 } 


	}

}
