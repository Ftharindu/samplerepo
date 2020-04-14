package samplePackage;

public class LoopStatement {
	public static void main(String args[]) {
		System.out.println("FOR LOOP");
		
//-----FOR LOOP--------------------------------------------------------------------------		
		int a;
		
		//print 1 to 10
		for( a=1; a<=10; a++)
		{
			System.out.println(a);
		}
		System.out.println("");
		//print 10 to 1
		for(a=10; a>=1; a--)
		{
			System.out.println(a);
		}
		
		System.out.println("");
		//print 1 to 10 except 7
		for(a=1; a<=10; a++)
		{
			if(a !=7)
			{
				System.out.println(a);
			}
		}
		System.out.println("");
		//print 1 to 10 except 4 and 7
		for(a=1; a<=10; a++)
		{
			if((a !=4)&&(a!=7))
			{
				System.out.println(a);
			}
		}
		
//------WHILE LOOP --------------------------------------------------------------------------------
		System.out.println();
		System.out.println("WHILE LOOP");
		int i = 1;
		//print 1 to 10
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
		
		System.out.println("");
		
		//print 10 to 1
		int h = 10;
		while(h>=1)
		{
			System.out.println(h);
			h--;
		}
		
		System.out.println();
		
		//print 1 to 10 except 7
		while(i<10) 
		{
			if(i!=7)
			{
				System.out.println(i);
			}
		i++;	
			
		}

//---------------------DO WHILE LOOP-----------------------------------------------------------------------
		System.out.println("do while loop");
		
		int b=20 ;
		//print 1 to 10
		do
		{
			System.out.println(b);
			b++;
		}while(b<=30);
		
		//print 10 to 1

//-------------------Enhanced FOR LOOP----------------------------------------------------------
		System.out.println("");
		System.out.println("using string array, values assign with array");
		String [] language = {"c","COBOL0","JAVA"};
		for(String lang: language)
		{
			System.out.println(lang);
		}
		
		
		System.out.println("using integer array, values assign later ");
		int [] mathoperator= new int[4];
		int x=10, y=20;
		mathoperator[0]=x+y;
		mathoperator[1]=x-y;
		mathoperator[2]=x*y;
		mathoperator[3]=x/y;
		
		for (int operation:mathoperator)
		{
			System.out.println(operation);
		}
		
		
		System.out.println("using String array, values assign later");
		String [] language2 = new String[2];
		language2 [0]="c";
		language2 [1]="COBOL";
		
		for (String lang2:language2)
		{
			System.out.println(lang2);
		}
	}		
}
