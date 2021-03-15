package com.mainclass;

import com.objectclass.MyException1;
public class Example2 {
	public static void main(String[] args)
	{
		try {
			throw new MyException1();//throw an object of user defined error
		}
		catch(Exception e)
		{
			//System.out.println("error caught");
			System.out.println(e.getMessage());
		}
	}
}
