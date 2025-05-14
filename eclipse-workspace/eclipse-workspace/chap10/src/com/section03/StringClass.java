package com.section03;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String st1= "www.google.com";
		String[]aS1;
		aS1=st1.split("\\.");
		
		for (int i =0; i<aS1.length; i++) {
			System.out.println(aS1[i]);
		}
	}

}
