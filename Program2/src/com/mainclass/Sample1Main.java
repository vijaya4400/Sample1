package com.mainclass;

import com.objectclass.Sample1;
public class Sample1Main {
	public static void main(String[] args)
	{
		try {
			Sample1 s2 = new Sample1();
			s2.myMethod(1);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
