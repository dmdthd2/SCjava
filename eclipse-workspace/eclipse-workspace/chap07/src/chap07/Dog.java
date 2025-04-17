package chap07;

public class Dog {
	public String breed;
	public String color;
	protected int age;
	/*원래는 private*/public String name;
	
	public void bowwow() {
		System.out.println("멍멍 짖다");
	}

	protected void run() {
		System.out.println("달리다");
	}
	
	/*원래는 private*/public void sleep() {
		System.out.println("잠을 자다");
	}
}
