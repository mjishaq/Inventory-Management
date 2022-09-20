package com.java8.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentPredicate {
	
	private String subject;
	private Integer Marks;
	private Integer Marks2;
	public StudentPredicate(String subject, Integer Marks1, Integer Marks2) {
		this.subject=subject;
		Marks=Marks1;
		this.Marks2=Marks2;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Integer getMarks() {
		return Marks;
	}
	
	public Integer getMarks2() {
		return Marks2;
	}
	
	public void setMarks2(Integer marks2) {
	  this.Marks2=marks2;
	}
	public void setMarks(Integer marks1) {
		Marks = marks1;
	}
	
	
	
	public static void main(String[] args) {
		
		Function<Integer,Integer> marksAverage = i -> {
			Integer maxValue=0;
			if(i>maxValue) {
				maxValue=i;
			}
			return maxValue;
			} ;
			
			//Function<StudentPredicate,Integer> marksAvg = 
			
		   StudentPredicate s1=	new StudentPredicate("phy",50,30);
			StudentPredicate s2=	new StudentPredicate("phy",24,33);
			StudentPredicate s3=	new StudentPredicate("phy",20,30);
			List<StudentPredicate> objStudent = new ArrayList<>();
			objStudent.add(s1);
			objStudent.add(s2);
			objStudent.add(s3);
			
			List<Integer> x=  objStudent.parallelStream().map(obj -> (obj.getMarks() + obj.getMarks2())/2).collect(Collectors.toList());;
			
			
			OptionalInt y = x.stream().mapToInt(Integer::valueOf).max();
			
	System.out.println("Average Marks of students are :"+y);

	}
}
