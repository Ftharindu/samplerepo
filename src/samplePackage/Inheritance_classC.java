package samplePackage;

public class Inheritance_classC extends Inheritance_classB{//this is multi level inheritance because it access method and variable of class A using class B
	
	public static void main(){
		Inheritance_classC objc = new Inheritance_classC();
		System.out.println(objc.a);
		objc.add1();
		
	}

}
