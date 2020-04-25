package samplePackage;

public class EncapsulationClass1 {

	private String name = "Test Automation";
	
	//getter method
	public String getName()
	{
		return name;
	}
	//setter method
	public void setName(String newName)
	{
		name = newName;
	}
	public static void main(String args[])
	{
		EncapsulationClass1 obj = new EncapsulationClass1();
		System.out.println(obj.getName());
	}
}
