package samplePackage;

public class Inheritance_classE {

	public static void main(String args[]) {
		
		//Access non-static class members from another class without inheritance(extends). 
		//It can do creating object using parent class name    
		Inheritance_classD objF = new Inheritance_classD();
		objF.add();
		System.out.println(objF.a);
		objF.add1();
		System.out.println(objF.c);
	}
}
