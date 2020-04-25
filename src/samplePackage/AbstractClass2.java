package samplePackage;

public class AbstractClass2 extends AbstractClass1{

	@Override
	public void engine() {
		System.out.println("Bikes and engine");
		
	}

	@Override   //parent class have method declaration
	public void wheels() {
		//child class have method implementation
		System.out.println("BIkes have Wheels");
	}
	
	public static void main(String args[])
	{
		//create object
		AbstractClass2 obj1 = new AbstractClass2();
		obj1.engine();
		obj1.seat();
		obj1.wheels();
		obj1.handel();
	}

}
