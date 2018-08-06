package com.test.methodreference;

interface FunctionalInterface {
	
	void interfaceMethod();
}


public class MethodReferenceBasicExample {
	
	public void classMethod(){
		System.out.println("hello from classmethod()");
	}

	public static void main(String[] args) {

		MethodReferenceBasicExample methodRef = new MethodReferenceBasicExample();
		
		FunctionalInterface fi =  methodRef::classMethod;
		
		fi.interfaceMethod();
		
		
	}

}
