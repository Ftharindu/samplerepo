package samplePackage;

public class JavaExternalMethod {
	//create method for invoking object 
	public int multiply(int a, int b, int c)
	{
		int result=a*b*c;
		return result;
	}
	// main method not written here because not executing anything in this class.
	//we only need to write the main method if we execute something in this class.
	//public static void main(String args[])    <---- this is main method
	
	
	//create method for with invoking object
	public static void studentrank(int marks)
	{
		if(marks>=600)
		{
			System.out.println("RANK A");
		}
		else
		{
			System.out.println("RANK B");
		}
	}
}
