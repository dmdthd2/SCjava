package chap11;

public class Example06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("try블록");
			throw new MyException("MyException 클래스가 호출!");
			
		}catch(Exception e) {
			System.out.println("catch블록");
			System.out.println(e);
		}
	}

}
