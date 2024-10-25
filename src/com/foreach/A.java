package com.foreach;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A {
	
	public static void main(String[] args) {
		
		List <Integer> data = Arrays.asList(1,2,3,4,5,6);
		
		data.forEach((num)->{System.out.println((num*num));});
		
		List <Integer> data1 = new ArrayList();
		
		data.forEach((num)->{
			            if(num%2==0)
			            {
			            	//System.out.println(num);
			            	data1.add(num);
			            }
			            	
			            });
		System.out.println();
		System.out.println(data1);
		}

}
