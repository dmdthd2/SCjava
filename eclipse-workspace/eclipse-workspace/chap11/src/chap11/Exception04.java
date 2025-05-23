package chap11;

import java.util.*;
public class Exception04 {
   
   static void check(int num) throws Exception {
      if (num<0)
         throw new Exception("0보다 작습니다.");
      else
         System.out.println(num);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("숫자를 입력하세요.");
      int num = sc.nextInt();
      
      try {
         if (num < 0)
            throw new Exception("0보다 작습니다.");
         else   
        	 check(num);
            
      } catch(Exception e) {
         System.out.println("예외 발생 "+e);
      }

   }

}
