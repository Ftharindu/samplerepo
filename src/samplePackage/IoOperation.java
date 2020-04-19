package samplePackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class IoOperation {
	public static void main (String args[]) throws IOException
	
	{
//--------------INPUT OUTPUT OPERATORS---------------------------------------------------
		//create scanner object
		/*
		 * Scanner scan= new Scanner(System.in);//system.in is an input stream
		 * 
		 * 
		 * System.out.println("Enter your name"); String name = scan.nextLine();
		 * System.out.println("You are name is "+ name);
		 * 
		 * System.out.println("Enter your city"); String city = scan.next();
		 * System.out.println("Your city is "+city);
		 * 
		 * System.out.println("Enter Number"); String number = scan.next();
		 * System.out.println("Your name is " +number);
		 * 
		 * System.out.println("Enter Mobile number"); long mobNumb = scan.nextLong();
		 * System.out.println("You Mobile number is "+mobNumb);
		 * 
		 * System.out.println("Enter value"); double value = scan.nextDouble();
		 * System.out.println("You Mobile number is "+value);
		 * 
		 * System.out.println("Enter caharacter"); char abc =
		 * scan.next().charAt(0);//itis reading the given index
		 * System.out.println("You char is " +abc);
		 * 
		 * 
		 * System.out.println("Enter Boolean"); boolean bool = scan.nextBoolean();
		 * System.out.println("You char is " +bool);
		 * 
		 * int a=10, b=20; System.out.println("Selenium Testing");//selenium testing
		 * System.out.println("value is " + b);//message with variable value
		 * System.out.println("value a is " + a +" valuue b is "+b);
		 */
	
//------FILE HANDLING-------------------------------------------------------------------------
		//create folder  (object is created for file)
		File fileobject = new File("D:/createfile");
		fileobject.mkdir();
		  
		//check the existence of folder
		boolean a=fileobject.exists();
		if(a==true)
		{
			System.out.println("Folder available");
		}
		else
		{
			System.out.println("Folder not available");
		}
		
		//delete a folder
		//fileobject.delete();
		
		//create a text file
		File textfile = new File("D:/createfile/new.txt");
		textfile.createNewFile();
		//delete file
		textfile.delete();
		
//---------EXCEPTION HANDLING-------------------------------------------------------------------
		
		/*Scanner scnobj = new Scanner(System.in);
		System.out.println("read two numbers");
		String s1=scnobj.nextLine();
		String s2=scnobj.nextLine();
		System.out.println(s1+s2);
		int c = Integer.parseInt(s1);//parseint is a built in class to convert string to integer
		int b = Integer.parseInt(s2);
		System.out.println(c+b);
		scnobj.close();
		*/
		
		
		//Arithmetic exception
		int d=10;
		int e=0;
		try
		{
			int result =d/e;
			System.out.println(result);
		}
		catch(ArithmeticException f)
		{
			System.out.println("Divided by Zero Error");
		}
		System.out.println("Hello JAVA");
		System.out.println("Hello Selenium");
		
		//arrayindexoutofbounds exception
		int [] abc = new int[10];
		try
		{
			abc[30]=200;
			System.out.println(abc[30]);
		}
		catch(ArrayIndexOutOfBoundsException abcd)
		{
			System.out.println("array index out of bounds error");
		}
		
	}
} 
