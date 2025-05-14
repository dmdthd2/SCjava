package com.section03;

public class WrapperClass {

	public static void main(String[] args) {
		Integer n1=100;
		Integer n2=200;
		
		System.out.println("n1: "+n1);
		System.out.println("n2: "+n2);
		
		
		String v1 =n1.toString();
		String v2 =Integer.toString(n1);
		
		System.out.println("n1.toString(): "+v1);
		System.out.println("Integer.toString(n1): "+v2);
	}

}
