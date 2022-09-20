package com.java8.practise;

import java.util.Optional;

public class Optional_Pratise {

	public void withoutOptional() {
		
		String abc = null;
		String[] abc2 = new String[10];
		
		
		System.out.println(abc2[5]);
	}
	public void WithOptional() {
		
		Optional<String> xyz = Optional.empty();
		String[] abc2 = new String[10];
		abc2[5] = "hello";
		Optional<String> value= Optional.ofNullable(abc2[5]);
		value.ifPresent( System.out :: println);
		System.out.println("asdf"+value.orElse("No Value"));
		
		//Conver to uppercase using map 
		System.out.println(value.map(String::toUpperCase));
		
		
		//flat map to remove optional of outer layer
		System.out.println(value.filter(abc -> abc.equals("abc")));
		
		
		
	}
	
	public static void main(String[] args) {
		Optional_Pratise abc = new Optional_Pratise();
				//abc.withoutOptional();
				abc.WithOptional();
		
	}
	
	
}
