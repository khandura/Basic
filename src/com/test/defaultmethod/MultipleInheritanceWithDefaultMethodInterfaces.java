package com.test.defaultmethod;


@FunctionalInterface
interface DefaultMethodInterface1 {
	
	void absMethod();
	
	default void defaultMethod() {
		System.out.println("Default method from DefaultMethodInterface1");
	}
}

interface DefaultMethodInterface2 {
	
	default void defaultMethod() {
		System.out.println("Default method from DefaultMethodInterface1");
	}
}


class DefaultMethodInterfaceImplementation implements DefaultMethodInterface1,DefaultMethodInterface2 {

	@Override
	public void defaultMethod() {
		DefaultMethodInterface1.super.defaultMethod();
		
		System.out.println("Overriden defaultMethod from DefaultMethodInterfaceImplementation");
	}

	@Override
	public void absMethod() {
		// TODO Auto-generated method stub
		
	}
		
}


public class MultipleInheritanceWithDefaultMethodInterfaces {

	public static void main(String[] args) {
		
		DefaultMethodInterface1 interface1 =  ()-> {
				System.out.println("Inside the abstract method of interface impl");				
		};

	}

}
