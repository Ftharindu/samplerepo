package samplePackage;

public class Polymorphism_MethodOverRiding_Subclass{
	public void myMethod()
	{
		System.out.println("UFT for Test Automation");
	}
	
	//method overriding is if two or methods with same name available in the supper class and sub class
	public static void main(String args[])
	{
		Polymorphism_MethodOverRiding_Subclass Obj1 = new Polymorphism_MethodOverRiding_Subclass();
		Obj1.myMethod();
		
		//create object using parent class
		Polymorphism_MethodOverRiding_Supperclass Obj2 = new Polymorphism_MethodOverRiding_Supperclass();
		Obj2.myMethod();
	}

}
