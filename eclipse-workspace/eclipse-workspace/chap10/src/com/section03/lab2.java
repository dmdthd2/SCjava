package com.section03;
import com.javamaster.mypackage.*;
public class lab2 {
	

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
		System.out.println(d1.equals(d2));
		String st1 = d1.bowwow();
		String st2 = d2.bowwow();
		System.out.println(st1.equals(st2));
	}

}
