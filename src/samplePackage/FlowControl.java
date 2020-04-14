package samplePackage;

public class FlowControl {
	public static void main(String args[])
	{
		int a,b,c;
		a=-50; b=40; c=30;
		//execute a block of statement when condition is true
		if(a>b) {
			System.out.println("A is a Big Number");
		}
		
//----------------------------------------------------------------------------------------------		
		//execute a block of statement when a compound condition is true
		if ((a>b)&&(a>c)) {
			System.out.println("A is a big number");
		}
		
//-----------------------------------------------------------------------------------------------		
		//execute block of statement when condition is true, otherwise execute another block of statement
		if(a>b) {
			System.out.println("A is a big number");
		}
		else {
			System.out.println("B is a big number");
		}

//----------------------------------------------------------------------------------------------
		//Decide among several alternates(else if statement)
		if ((a>=1) && (a<=100)) {
			System.out.println("A is Small number");
		}
			
		else if ((a>100)&&(a<=1000)) {
			System.out.println("A is a Medium Number");
			
		}
		else if (a>10000) {
			System.out.println("A is a High Number");
		}
		
		else {
			System.out.println("A is either Zero or negative number");

		}
		
//-----------------------------------------------------------------------------------------------		
		//execute a block if statement when more than one condition is true.
		if(a>b)
		{
			if(a>c) 
			{
				System.out.println("A is big");
			}
			else {
				System.out.println("A is small");
			}
			
		}
		else {
			System.out.println("Nothing");
		}
//-----------------------------------------------------------------------------------------------		
		//Decide among several alternatives(using wsitch case statements)
		char grade='B';
		
		switch (grade) {
		case'A':
			System.out.println("Excelent");
			break;
		case 'B':
			System.out.println("well done");
			break;
		case 'C':
			System.out.println("better");
			break;
		default:
			System.out.println("invalid");
		}
		
		
	}
}
