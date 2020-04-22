package samplePackage;

public class Polymorphism_MethodOverLoading {
	
	//method overloading is if two or more methods having same name in the same class but they differ in following ways,
	//1. Number of arguments
	//2. types of arguments
	
	public void add(int a,int b)
	{
		System.out.println(a+b);
	}
	
	public void add(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b)
	{
		System.out.println(a+b);
	}
	
	public void add(double a,double b, double c)
	{
		System.out.println(a+b+c);
	}
	
	public static void main(String args[])
	{
		Polymorphism_MethodOverLoading obj = new Polymorphism_MethodOverLoading();
		obj.add(2, 2);
		obj.add(2.222, 2.222);
		obj.add(10, 20, 30);
		obj.add(2.222, 2.222, 2.222);
	}

}
