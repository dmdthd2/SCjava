package chap11;

public class Exception05 {

	void check(int we)throws InvalidException {
		if(we<100) {
			throw new InvalidException("InvalidException클래스 호출");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exception05 obj = new Exception05();
		try {
			obj.check(60);
		}catch(Exception e) {
			System.out.println("예외처리.");
			System.out.println(e.getMessage());
		}

	}

}
