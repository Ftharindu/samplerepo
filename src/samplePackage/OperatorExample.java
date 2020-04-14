package samplePackage;

public class OperatorExample {

		public static void main (String args[])
		{
			int a = 10, b=5;
			String c = "Selenium", d="testing";
			
			System.out.println("Addition of a,b is"+ (a+b));// first + is for concatenate the text and the values , second addition for addition of a and b
			System.out.println("Subtraction of a,b"+ (a-b));
			System.out.println("Multiplication of a,b" + (a*b));
			System.out.println("Division of a,b" + (a/b));
			System.out.println("module of a,b"+ (a%b));
			
			b=10;
			a = ++b;
			System.out.println(a);
			 
			b=10;
			a=--b;
			System.out.println(a);
			
			//----relational operators
			 b=20;
			 System.out.println();
			System.out.println((a>b));//false
			System.out.println((a>=b));//false
			System.out.println((a==b));//false
			System.out.println((a<b));//true
			System.out.println((a<=b));//true
			System.out.println((a!=b));//true
			
			
			//logical operators
			boolean x=true, y=false;
			 System.out.println();
			System.out.println(!(x && y));//true
			System.out.println(x&&y);//false
			System.out.println((x||y));//true
			
			int e=1000, f=500, g=700;
			if((e>f) && (e>g))
			{
				System.out.println("A is a big number");
			}
			else
			{
				System.out.println("A is not a big number");
			}
			
			g=7000;
			if((e>f) && (e>g))
			{
				System.out.println("A is a big number");
			}
			else
			{
				System.out.println("A is not a big number");
			}
			
			int h=10;
			System.out.println(h);//10
			h+=10;
			System.out.println(h);//20
			h-=10;
			System.out.println(h);//10
			h*=10;
			System.out.println(h);//100
			
			
		}
}
