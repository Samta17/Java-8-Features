package com.june21;

public interface Features {
	
	public abstract void compute(int a, int b);
	public  static void compute1(int a, int b)
	{
		int c = a*b;
	}
	
	public default void compute2(int a, int b)
	{
		System.out.println(a/b);
	}

}
