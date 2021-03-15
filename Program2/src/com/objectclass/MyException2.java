package com.objectclass;

public class MyException2 extends Exception{
	int a;
	public MyException2(int b)
	{
		a=b;
	}
	public String toString()
	{
		return("Exception number = "+a);
	}
}
