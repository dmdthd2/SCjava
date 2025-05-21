package chap11;

class MyException extends Exception {
	//example06
	String str1;
	public MyException(String str2) {
		str1=str2;
	}public String toString() {
		return("MyException 발생! "+str1);
	}

}
