package com.mainclass;

import com.objectclass.MyException;
public class Example {
	public static void main(String args[]){
		try{
			throw new MyException("This is My error Message");
		}
		catch(MyException exp){
			System.out.println(exp) ;
		}
	   }
}
