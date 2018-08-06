package com.test.arbit;

public class RunnableWithLambda {

	public static void main(String[] args) {

		Runnable runnable = () -> System.out.println("Hello");

		Thread t1 = new Thread(runnable);
		t1.start();

		Thread t2 = new Thread( () -> { System.out.println("Hello from run method"); } );
		t2.start();

	}

}
