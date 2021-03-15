package com.mainclass;

import com.objectclass.Sample6;
public class Sample6Main {
	public static void main(String[] args)
	{
		Sample6 s6 = new Sample6();
		try
		{
			s6.fun();
		}
		catch(NullPointerException e)
		{
			System.out.println("caught in main");
		}
	}
}
