package com.java8.practise;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
	
	public static void main(String[] args) {
		
		
		Predicate<Integer> isEven = i -> i%2 == 0;
		
		Predicate<Integer> isGreaterthen50 = i -> i > 50; 
		
		System.out.println("Printing even values:"+ isEven.test(50));
		System.out.println("Checking greater then 50"+ isGreaterthen50.and(isEven).test(61));
		System.out.println("Is gerater then 50 or even"+ isGreaterthen50.or(isEven).test(25));
		System.out.println("Is not greater then 50"+ isGreaterthen50.negate().test(49));
		
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		List<Integer> collect=list.stream().filter(isEven).collect(Collectors.toList());
		System.out.println("List of even numbers:"+collect);
		
		
	}

}
