package com.mainclass;

import java.util.Scanner;

import com.objectclass.InvalidAgeException;
public class Example1 {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int  n = sc.nextInt();
		try{ 
			InvalidAgeException t1 = new InvalidAgeException();
			t1.validate(n);
		}
		catch(Exception m)
		{
			System.out.println("Exception occured: "+m);
			}  
	}
}
