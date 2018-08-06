package com.test.defaultmethod;

interface DefaultMethodInterface {

	void syaHello();

	default void defaultMethod() {
		System.out.println("Hello from default method from interface DefaultMethodInterface");
	}

	default void anotherDefaultMethod(String user) {
		user = user +" Edited";
		System.out.println("Hello from anotherDefaultMethod from interface DefaultMethodInterface : "+ user);
	}
}

class DefaultMethodInterfaceImpl implements DefaultMethodInterface {

	@Override
	public void syaHello() {
		System.out.println("Hello from sayHello() method from class DefaultMethodInterfaceImpl");

	}

	@Override
	public void anotherDefaultMethod(String user) {
		System.out.println("Hello from anotherDefaultMethod from interface DefaultMethodInterfaceImpl  : "+ user);
	}

}

public class DefaultMethodInterfaceTester {

	public static void main(String[] args) {

		DefaultMethodInterface defaultMethodInterface = () -> System.out.println("Hello ");

		System.out.println("**************INTERFACE************");
		defaultMethodInterface.syaHello();
		defaultMethodInterface.defaultMethod();
		defaultMethodInterface.anotherDefaultMethod("ABC");

		System.out.println("\n**************IMPLEMENTOR CLASS************");
		defaultMethodInterface = new DefaultMethodInterfaceImpl();
		defaultMethodInterface.syaHello();
		defaultMethodInterface.defaultMethod();
		defaultMethodInterface.anotherDefaultMethod("XYZ");

		
	}

}
