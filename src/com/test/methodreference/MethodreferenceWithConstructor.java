package com.test.methodreference;

interface DummyFunctionalInterface {
	
	DummyClass dummyInterfaceMethod(String str);
}

class DummyClass {
	
	public DummyClass(){
		System.out.println("Hello from default constructor");
	}
	
	public DummyClass(String str){
		System.out.println("Hello "+str);
	}
	
	public void anotherDummyMethod(String str){
		System.out.println("Hello from anotherDummyMethod()");
	}
}

public class MethodreferenceWithConstructor {

	public static void main(String[] args) {
	
		DummyFunctionalInterface di = DummyClass::new;
		
		di.dummyInterfaceMethod("Lambda");

		
	}

}
