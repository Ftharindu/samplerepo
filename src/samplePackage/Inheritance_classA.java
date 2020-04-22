package samplePackage;

public class Inheritance_classA {
	//declare non-static variables
	int a=10;
	int b=20;
	
	//declare non-static method(without returning value)
	public void add1() {
		System.out.println(a+b);
	}

public static void main(String args[])
{
	Inheritance_classA obj = new Inheritance_classA();
	//access variable
	System.out.println(obj.a);
	//access method
	obj.add1();
}
}
