package samplePackage;

public class JavaMethods {
//------------------user defined method--------------------------------------------
	
//-----Write method with return value-------------------------------------------------------
	//CREATE METHOD (by invoking the object)
	/*public int multiply(int a, int b, int c)
	{
		int result = a*b*c;
		return result;
	}
	
	public static void main(String args[])
	{
		//create object
		JavaMethods MethodObject = new JavaMethods();
		//call method
		int abc = MethodObject.multiply(10, 25, 35);
		System.out.println(abc);
		
		System.out.println(MethodObject.multiply(10, 25, 35));
	}*/
	
	
	//CREATE METHOD(without invoking a object)
	/*public static int multiply(int a,int b, int c)
	{
		int result = a*b*c;
		return result;
	}
	//what is the functionality of static modifier = we can access method without object
	public static void main(String args[])
	{
		//calling method
		int abc = multiply(10, 10, 10);
		System.out.println(abc);
		
		System.out.println(multiply(10, 25, 35));
	}*/

//-------write method without return value---------------------------------------------------
	//CREATE METHOD(by invoking method)
	/*public void StudentRank(int Marks)
	{
		if (Marks>=600)
		{
			System.out.println("RANK A");
		}
		else if(Marks>=500)
		{
			System.out.println("RANK B");
		}
		else
		{
			System.out.println("RANK C");
		}
	}
	
	public static void main (String args[])
	{
		//create object
		JavaMethods abc = new JavaMethods();
		//calling method
		abc.StudentRank(450);
		
	}*/
	
	//CREATE METHOD(without invoking any object)\
	/*public static void studentrank(int marks)
	{
		if(marks>=600)
		{
			System.out.println("RANK A");
		}
		else if(marks>=500)
		{
			System.out.println("RANK B");
		}
		else
		{
			System.out.println("RANK C");
		}
	}
	
	public static void main(String args[])
		{
		//call method without object
			studentrank(1);
		}*/
}
