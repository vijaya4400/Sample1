package com.objectclass;

public class Sample2 {
	public void method1() throws ArithmeticException
	{
		throw new ArithmeticException("something error");
	}
	public void method2() throws ArithmeticException
	{
		method1();
	}
	public void method3()
	{
		try
		{
			method2();
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic exception is handled");
		}
	}
}
