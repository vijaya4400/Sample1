package com.mainclass;
import java.util.Scanner;
import com.objectclass.Sample;
public class SampleMain {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Sample s1 = new Sample();
		s1.eligibility(a);
	}
}
