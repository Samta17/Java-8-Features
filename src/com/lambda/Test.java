package com.lambda;

public class Test  {
	
	public static void main(String[] args) {
		
		MyInterface obj1 = (int a, int b) ->{System.out.println(a+b);};
		
		obj1.compute(10, 20);
		
        MyInterface obj2 = (int a, int b) ->{System.out.println(a*b);};
		
		obj2.compute(10, 20);
	}

}
