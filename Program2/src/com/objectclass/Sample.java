package com.objectclass;

public class Sample 
{
	public void eligibility(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("not eligible to vote");
		}
		else
		{
			System.out.println("eligible to vote");
		}
	}
}
