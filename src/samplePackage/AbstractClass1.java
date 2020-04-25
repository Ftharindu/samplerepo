package samplePackage;

public abstract class AbstractClass1 {
	//concrete method
	public void handel()
	{
		System.out.println("Bikes have handle");
	}
	//concrete method
	public void seat()
	{
		System.out.println("Bikes have seats");
	}
	//abstract method
	public abstract void engine();
	//abstract method
	public abstract void wheels();
	
	public static void main(String args[])
	{
		//how to access method in parent class by creating object using child class
		//Why we are using the child class name is the parent class = because in the child class only we implemented abstract methods.
		AbstractClass2 obj2 = new AbstractClass2();
		obj2.engine();
		obj2.wheels();
	}
}
