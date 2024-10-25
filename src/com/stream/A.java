package com.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class A {
	
	public static void main(String[] args) {
		
		List <Integer> marks = Arrays.asList(55,67,87,91,77);
		
		List <Integer> newMarks = marks.stream().map((m) -> m+5).collect(Collectors.toList());
		
		System.out.println(marks);
		System.out.println(newMarks);
		
		List<String> name = Arrays.asList("Samta","Arti","Divya","Rani");
		
		List <Integer> lnt = name.stream().map((ln) -> ln.length()).collect(Collectors.toList());
		System.out.println(lnt);
		
		List <Integer> topperlist = marks.stream().filter(m -> m>90).collect(Collectors.toList());
		System.out.println(topperlist);
		
		
		int sum = marks.stream().reduce(1000,(a, b)->a+b);
		System.out.println(sum);
		
		
		
	}
}
