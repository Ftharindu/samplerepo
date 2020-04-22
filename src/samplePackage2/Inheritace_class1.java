package samplePackage2;

import samplePackage.Inheritance_classD;

public class Inheritace_class1 extends Inheritance_classD{
	public static void main(String args[])
	{
//here we access protected class members of a class in another package though inheritance
	Inheritace_class1 Obj1 = new Inheritace_class1();
	Obj1.add1();
	System.out.println(Obj1.c);
	}
}
