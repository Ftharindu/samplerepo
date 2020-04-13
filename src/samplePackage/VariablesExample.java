package samplePackage;

public class VariablesExample {
	static int a=100; //static variable (static/class level variables should declare before main method)
	
	public int salary()//create public method
	{
		int mysalary = 10000+2000+1500;  // local variable(variable declared inside on a method)
		return mysalary;
	}
	public static void main(String args[])
	{
		
		int b=200; // instance variable(variable declared in class but outside of a method or a block)
		System.out.println(a);//100
		System.out.println(b);//200
		//System.out.println(mysalary);//this is not work its a local variable used in a method. this variable used only within the method
		//if i want to access salary method and display mysalary.
		//using object you can access method by invoking the object you can access the method.
		
		VariablesExample SalaryObj = new VariablesExample();//create object for salary method.
		SalaryObj.salary();
		
		System.out.println(SalaryObj.salary()); //13500 here directly display the mysalary
	
		
		for (int i=1; i<=5; i++) {//i is a local variable
			System.out.println(i);
			System.out.println(b);
		}
		
		
	}
} 
