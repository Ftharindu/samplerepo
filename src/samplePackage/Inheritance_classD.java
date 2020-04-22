package samplePackage;

public class Inheritance_classD 
	{
	//public non-static variable
	public int a=10;
	public int b=20;
	//public non-static method
	public void add() {
	System.out.println(a+b);
	}
	
	protected int c=10;
	protected int d=20;
	//protected non-static method
	protected void add1() {
	System.out.println(c+d);
	}

	public static void main(String args[])
	{
		Inheritance_classD objD1 = new Inheritance_classD();
		System.out.println(objD1.a);
		objD1.add();
		
		Inheritance_classD objD2 = new Inheritance_classD();
		System.out.println(objD2.c);
		objD2.add1();
	}
}
