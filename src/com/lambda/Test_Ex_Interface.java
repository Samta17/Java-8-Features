package com.lambda;

import java.util.Arrays;
import java.util.List;

public class Test_Ex_Interface {

	public static void main(String[] args) {
		
		
		Ex_Interface f1 = (int []a, int b)->
		                  {
			                   for(int i=0; i<a.length; i++) {
							      System.out.println(a[i]+b);
			                   }
			              };
			              
			  int arr[] = {1,2,3,4,5};
			  f1.compute(arr, 20);
		
	}
}
