package chap04;

public class Example06 {

	public static void main(String[] args) {
		char grade = 'B';
		switch (grade) {
		case 'A':
			System.out.println("매우 우수");
			break;
		case 'B':
			System.out.println("우수");
			break;
		case 'C':
			System.out.println("좋음");
			break;
		case 'D':
			System.out.println("좀더 열심히");
			break;
		case 'F':
			System.out.println("미흡");
			break;
			default:
				System.out.println("잘못된 등급");
		}

	}

}
