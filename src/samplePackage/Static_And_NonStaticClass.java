package samplePackage;

public class Static_And_NonStaticClass {
//declare static variables
	static int a=10,b=20;
	
 //declare non-static variables
	int c=30, d=40;
	
//create static methods with returning a value
	public static int Add()
	{
		int result=a+b;
		return result;
	}
	
//create static method without returning any value	
	public static void multiply()
	{
		System.out.println(a*b);
	}
	
//create non-static methods with returning value
	public int add2()
	{
		int result2=c+d;
		return result2;
	}
	
//create non-static method without returning any value
	public void multiply2()
	{
		System.out.println(c*d);
	}
	
public static void main (String args[])
{
//Access static class members(Using class name)
	int x=Static_And_NonStaticClass.Add();
	System.out.println(x);
	//access static variable
	System.out.println(a);
	//or
	System.out.println(Static_And_NonStaticClass.a);//class name use to access another class in inheritance
	//Access static method (without returning any value)
	Static_And_NonStaticClass.multiply();
	 
	//Access non-static class members(Using Object)
	Static_And_NonStaticClass Object = new Static_And_NonStaticClass();
	int y = Object.add2();
	System.out.println(y);
	//access non-static variable
	System.out.println(Object.c);
	//Access non-static method (without returning any value)
	Object.multiply2();
}
}
