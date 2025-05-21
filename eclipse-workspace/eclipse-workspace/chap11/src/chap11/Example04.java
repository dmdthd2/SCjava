package chap11;

public class Example04 {
	static void check() throws Exception {
		System.out.println("내부");
		int div =5/0;
		System.out.println(div);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			check();
			}
		catch(Exception e) {
			System.out.println("예외발생!!"+e);
		}

	}

}
