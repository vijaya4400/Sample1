package com.objectclass;

import java.io.IOException;

public class Sample1 {
	public void myMethod(int num) throws IOException, ClassNotFoundException 
	{
		if(num==1)
			throw new IOException("ioexception occurs");
		else
			throw new ClassNotFoundException("classnotfoundexception is occurs");
	}
}
