package samplePackage;

import java.util.Arrays;

public class JavaBuiltInMethods {
	
	public static void main(String args[])
	{
		///////////////////////////////////////////
//---------------------STRING METHODS-----------------------------------------------
		///////////////////////////////////////////
		String str1="selenium";
		String str2="SELENIUM";
		String str3="Seleniuma";
		String str4="selenium";	
		String str5="testing";
		String str6="TESTING";
		String str7="selenium123";
		String str8="              selenium";
		String str9="Welcome to selenium testing";
		
		
	//compareTo() method
		//3 way comparison
		System.out.println(str1.compareTo(str2));//Positive value (greater than zero)
		System.out.println(str1.compareTo(str3));//Negative value (less than zero)
		System.out.println(str1.compareTo(str4));//0 
		
	//equals() method
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equals(str4));//true
		
	//concat() method
		System.out.println(str1.concat(str5));//selenium testing (using contact method)
		System.out.println(str1+str5);//selenium testing (using concatenation operator)
		
	//charAt()
		System.out.println(str1.charAt(1));//e 
		
	//equalsIgnorecase() method
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1.equalsIgnoreCase(str3));//fasle
		System.out.println(str5.equalsIgnoreCase(str6));//true
		
	//toUppercase() method
		System.out.println(str1.toUpperCase());//SELENIUM
		System.out.println(str7.toUpperCase());//SELENIUM123
		System.out.println(str2.toUpperCase());//SELENIUM
	
	//toLowercase() method
		System.out.println(str1.toLowerCase());//selenium
		System.out.println(str2.toLowerCase());//selenium
		System.out.println(str7.toLowerCase());//selenium123
		
	//trim() method
		System.out.println(str8);
		System.out.println(str8.trim());
		
	//substring() method
		System.out.println(str9.substring(11));
		System.out.println(str9.substring(20));
		System.out.println(str9.substring(20, 27));
		
	//endsWith() method
		System.out.println(str9.endsWith("testing"));//true
		System.out.println(str9.endsWith("welcome"));//false
		
	//length() method
		System.out.println(str9.length());
		System.out.println(str1.length());
		
			///////////////////////////////////////////
//---------------------NUMBER METHODS-----------------------------------------------
			///////////////////////////////////////////
		//integer class wraps a value of the primitive type int in an object
		//An object of type integer contains a single field whose type is int
		
		//compareTo() method
		int xy = 5;
		Integer abc=xy;
		System.out.println(abc.compareTo(5));//0
		System.out.println(abc.compareTo(10));//-1
		System.out.println(abc.compareTo(2));//1
		
		//equals() method
		System.out.println(abc.equals(5));
		System.out.println(abc.equals(10));
		System.out.println(abc.equals(2));
		
		//abc() method - it returns absolute value. it doesnt round the value
		double ab=10.234;
		double bcd=10.784;
		double cd=10.5;
		System.out.println(Math.abs(ab));
		System.out.println(Math.abs(bcd));
		
		//round() 
		System.out.println(Math.round(ab));
		System.out.println(Math.round(bcd));
		System.out.println(Math.round(cd));
		
		//min() methods
		int g=10, h=20;
		double i=10.234, j=10.345;
		System.out.println(Math.min(g, h));//
		System.out.println(Math.min(i, j));
		
		// max() methods
		System.out.println(Math.max(g, h));//
		System.out.println(Math.max(i, j));
		
		//random method
		System.out.println(Math.random());
		
		
			///////////////////////////////////////////
//---------------------NUMBER METHODS-----------------------------------------------
			///////////////////////////////////////////
	//character class wraps a value of primitive data type char is an object
		//isLetter() method
		char a='A';
		char b='1';
		char c='b';
		
		System.out.println(Character.isLetter(a));
		System.out.println(Character.isLetter(b));
		//without variables you can directly use values
		System.out.println(Character.isLetter('D'));
		System.out.println(Character.isLetter('1'));
		System.out.println(Character.isLetter('$'));
		
		//isDigit() method
		System.out.println(Character.isDigit(a));
		System.out.println(Character.isDigit(b));
		//without variables you can directly use values
		System.out.println(Character.isDigit('D'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('$'));
		
		//isUppercase() method
		System.out.println(Character.isUpperCase(a));
		System.out.println(Character.isUpperCase(b));
		//without variables you can directly use values
		System.out.println(Character.isUpperCase('D'));
		System.out.println(Character.isUpperCase('1'));
		System.out.println(Character.isUpperCase('$'));
		System.out.println(Character.isUpperCase('d'));
		
		//isLowerCase() method
		System.out.println(Character.isLowerCase(a));
		System.out.println(Character.isLowerCase(b));
		//without variables you can directly use values
		System.out.println(Character.isLowerCase('D'));
		System.out.println(Character.isLowerCase('1'));
		System.out.println(Character.isLowerCase('$'));
		System.out.println(Character.isLowerCase('d'));

		///////////////////////////////////////////
//---------------------NUMBER METHODS-----------------------------------------------
		///////////////////////////////////////////
		
		//lenth
		int [] array1 = {10,20,30,40};
		System.out.println(array1.length);
			
		//toString() method
		String [] stringarray1 = {"selenium","UFT","Loadrunner","RFT"};
		String str=Arrays.toString(stringarray1);
		System.out.println(str);
		
		//contain() method
		boolean m=Arrays.asList(stringarray1).contains("selenium");
		boolean n=Arrays.asList(stringarray1).contains("Testing");
		System.out.println(m);
		System.out.println(n);
	}

}
