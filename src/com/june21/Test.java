package com.june21;

public class Test {

	public static void main(String[] args) {
		
		Features f1 = new Features() {

			@Override
			public void compute(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("Sum : "+(a+b));
			}	
		};
		
		f1.compute(10, 20);
		
		Features f2 = new Features() {

			@Override
			public void compute(int a, int b) {
				// TODO Auto-generated method stub
				System.out.println("Multi : "+(a*b));
			}
			
		};
		
		f2.compute(5, 10);
	}
		
	}	
		
	
	

