package com.objectclass;

public class Sample6
{
	public void fun()
	{
		try {
			throw new NullPointerException();
		}
		catch(NullPointerException e)
		{
			System.out.println("caught fun()");
			throw e;//rethrowing exception
		}
	}
}
