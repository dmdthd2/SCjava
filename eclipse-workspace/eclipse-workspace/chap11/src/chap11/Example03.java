package chap11;

public class Example03 {

	public static void main(String[] args) {
		int a[]=new int[2];
		try {
			System.out.println("일부러 잘못되게 접근할 거다!"+a[3]);
		}catch(Exception e){
			System.out.println("예외 발생!\n0"+e);
		}finally {
			System.out.println("파이널은 항상 실행된다.");
		}

	}

}
