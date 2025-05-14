package com.section03;

import com.javamaster.mypackage.*;

public class lab {
	public static void main(String[] args) {
		Cat c1 =new Cat();
		Cat c2 = new Cat();
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c1.equals(c2));
		c1=c2;
		System.out.println(c1.equals(c2));
	}
}
