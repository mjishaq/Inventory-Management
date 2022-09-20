package com.java8.practise;

public class ImplementFuncInterface {

	private static void Functional1Interface() {
		Functional1Interface abc = () -> System.out.println("hello I am in ");
		abc.printHello();
		
		
	}
	
	private static void Functional2Interface() {
		
		
		com.java8.practise.ImplementFuncInterface1Param.Functional2Interface abc1 = (input) -> System.out.println(input);
		
		abc1.printHello("hello");
	}
	
	public static void main(String[] args) {
		Functional1Interface();
		Functional2Interface();
	}
		
		
	
	
}
