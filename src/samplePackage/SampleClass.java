package samplePackage;

import java.io.Console;
import java.lang.*;
 
public class SampleClass {
	
	//create method 
	public int multiply(int a, int b,int c) 
	{
		int result = a*b*c;
		return result;
	}

	
	public static void main (String [] args) 
	{
		//this is a sample program
		int a = 10, b,c; // Variables declaration
		  b=20; c=30; // Initialization
		
		final int money=100;//(value is fixed)constant declaration  final is non-access modifier int is data type money is constant name and 100 is value.
		
		System.out.println("Addtion of a,b is " + (a+b)); //addtion od a,b is 30
		System.out.println(money);//100
		System.out.println(c);//30 only variable value
		
		//conditional block
		if( a > b) {
			System.out.println("A is a Big number");
		}
		else
		{
			System.out.println("B is a Big number");
		}
		
		//Loop bloc  k
		for(int d=1; d<=10; d++)
		{
			System.out.println(d);
			//printing 1 to 10
		}
		
		//create object and access methods
		SampleClass Sampleobj = new SampleClass();
		int x = Sampleobj.multiply(10, 25, 50);
		System.out.println(x);
	
	} 

}
