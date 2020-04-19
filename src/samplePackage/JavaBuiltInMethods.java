package samplePackage;

public class JavaBuiltInMethods {
	
	public static void main(String args[])
	{
		String str1="selenium";
		String str2="SELENIUM";
		String str3="Seleniuma";
		String str4="selenium";	
		String str5="testing";
		String str6="TESTING";
		String str7="selenium123";
		String str8="              selenium";
		String str9="Welcome to selenium testing";
		
		
	//compareTo() method
		//3 way comparison
		System.out.println(str1.compareTo(str2));//Positive value (greater than zero)
		System.out.println(str1.compareTo(str3));//Negative value (less than zero)
		System.out.println(str1.compareTo(str4));//0 
		
	//equals() method
		System.out.println(str1.equals(str2));//false
		System.out.println(str1.equals(str4));//true
		
	//concat() method
		System.out.println(str1.concat(str5));//selenium testing (using contact method)
		System.out.println(str1+str5);//selenium testing (using concatenation operator)
		
	//charAt()
		System.out.println(str1.charAt(1));//e 
		
	//equalsIgnorecase() method
		System.out.println(str1.equalsIgnoreCase(str2));//true
		System.out.println(str1.equalsIgnoreCase(str3));//fasle
		System.out.println(str5.equalsIgnoreCase(str6));//true
		
	//toUppercase() method
		System.out.println(str1.toUpperCase());//SELENIUM
		System.out.println(str7.toUpperCase());//SELENIUM123
		System.out.println(str2.toUpperCase());//SELENIUM
	
	//toLowercase() method
		System.out.println(str1.toLowerCase());//selenium
		System.out.println(str2.toLowerCase());//selenium
		System.out.println(str7.toLowerCase());//selenium123
		
	//trim() method
		System.out.println(str8);
		System.out.println(str8.trim());
		
	//substring() method
		System.out.println(str9.substring(11));
		System.out.println(str9.substring(20));
		System.out.println(str9.substring(20, 27));
		
	//endsWith() method
		System.out.println(str9.endsWith("testing"));//true
		System.out.println(str9.endsWith("welcome"));//false
		
	//length() method
		System.out.println(str9.length());
		System.out.println(str1.length());
	}

}
