package com.objectclass;

public class MyException extends Exception {
	public String str1;
	   public MyException(String str2) 
	   {
		   str1=str2;
	   }
	   public String toString()
	   { 
		   return ("MyException Occurred: "+str1) ;
	   }
}
