package samplePackage;

public class Inheritance_classB extends Inheritance_classA{
	
	
	public static void main(String args[])
	{
		Inheritance_classB objB = new Inheritance_classB();
		//access non-static method of Inheritance_classA
		objB.add1();
		//access variable variable of Inheritance_classA
		System.out.println(objB.a);
	}
}
