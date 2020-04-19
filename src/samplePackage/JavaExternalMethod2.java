package samplePackage;

public class JavaExternalMethod2 {
	public int add(int d, int e, int f)
	{
		int result=d+e+f;
		return result;
	}
	
	public static void main(String args[])
	{
		//create object in internal/same class
		JavaExternalMethod2 def = new JavaExternalMethod2();
		//calling method in internal class
		int g = def.add(10, 10, 10);
		System.out.println(g);
		
		//create object for external/same class
		JavaExternalMethod abc = new JavaExternalMethod();
		//calling external method
		int x =abc.multiply(10, 10, 10);
		System.out.println(x);
		
		//calling method from external class without object
		JavaExternalMethod.studentrank(500);
	}
}
