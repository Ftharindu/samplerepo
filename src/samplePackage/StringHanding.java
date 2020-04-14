package samplePackage;

public class StringHanding {
	public static void main(String args[])
	{
		System.out.println("Selenium");
		System.out.println("123selenium");
		System.out.println("Selenium*&123");
		
		String myTool = "selenium";// String variable
		//String is keyword, myTool is string name(you can use any name), selenium is value.
		String [] myTools = {"UFT","Selenium","LoadRunner"};//Array of strings
		//String is keyword, Mytools is array name
		System.out.println(myTool);
		
		for(String Tool:myTools)
		{
			System.out.println(Tool);
		}
		
	//Operations on String	
	//-------1.Concatenating string------------------------------------------------------------------
		String str1 = "Selenium";
		String str2 = "Testing";
		System.out.println(str1+str2);
		//string + string = concatenation
		System.out.println("Selenium" + 1 + 1);
		//selenium - string, 1 is integer - the operation will be concatenation. = selenium1
		//selenium1 - string, 1 is integer - the operation will be concatenation = selenium11
		System.out.println(1+1+"selenium");
		//1 is integer, 1 is integer, the operation will be addtion = 2
		//2 is integer, selenium is string, the operation will be concatenation = 2selenium
		
		
		
	//-------2.string comparison---------------------	
		String str3="selenium";
		String str4="SELENIUM";
		String str5="SELENIUM";
		String str6="zselenium";
		
		//string comparison using == operator
		System.out.println(str3==str4);
		System.out.println(str4==str5);
		
		//string comparison using equals() method
		System.out.println(str3.equals(str4));
		System.out.println(str4.equals(str5));
		
		//string comparison using compareTo() method
		System.out.println(str3.compareTo(str4));//greater than 0 --> 32
		System.out.println(str4.compareTo(str5));//0 --> 0
		System.out.println(str3.compareTo(str6));//less than 0 --> -7
		
		
	//Declaration of array
	//------1st method---------------------------------
		int a[];
		a = new int[3];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		System.out.println(a[0]);
		System.out.println(a[1]+a[2]);
		
	//-----2nd method-----------------------------------
		int [] b = new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		
		System.out.println(b[0]);
		System.out.println(b[1]);
		System.out.println(b[1]+b[2]);
		
	//-----3rd method----------------------------------
		int [] c = {10,20,30,40};
		System.out.println(c[2]);
		
		
	//Declaring different types of arrays
		char [] abc = {'a','b','c'};// array of characters
		int [] xyz = {10,20,30,40};//array of integers
		String [] d = {"ABC","EFG","HIJ"};//array of strings
		Boolean [] e = {true,false};//Array of boolean values/logical values
		
		System.out.println(abc[1]);
		System.out.println(xyz[2]);
		
	//COpy values from one to another
		int [] array1 = {1,2,3,4};
		int array2 [] = array1;
		System.out.println(array2[2]);
		
		for(int i=0; i<array2.length; i++)
		{
			System.out.println(array2[i]);
		}
		
		
		
	//Types of Array
	//single dimensional array
		int [] array3 = {1,2,3,4,5};//single dimensional array
		int [][] array4 = {{1,2,3},{4,5,6}};//Multi dimensional array
		
		System.out.println(array4[0][0]);//1
		System.out.println(array4[1][0]);//4
		System.out.println(array4[1][2]);//6
		
	} 
}
