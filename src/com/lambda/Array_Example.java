package com.lambda;

import java.util.ArrayList;
import java.util.List;

public class Array_Example {
	
	public static void main(String[] args) {
		
		
		List <Integer> ls = new ArrayList<Integer>();
		
		int [] arr = {1,2,3,4,5};
		System.out.println(" Before : "+ls);
		for(Integer ele : arr)
		{
			ls.add(ele);
		}
		
		System.out.println("After : "+ls);
		System.out.println();
		System.out.println("By using forEach method & lambda function : ");
		ls.forEach((num)->{
			              System.out.println(num+20); 
			
		                  });
	}

}
