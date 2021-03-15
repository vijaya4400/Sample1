package com.mainclass;

import java.util.Scanner;

import com.objectclass.MyException2;
public class Example3 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		try
		{
			throw new MyException2(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
			//e.getStackTrace();
			
		}
	}
}
