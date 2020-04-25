package samplePackage;

public class javaInterfaceClass implements javainterface{
//2. reuse methods from interface to class
	@Override
	public void engine() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have engine.");
		
	}

	@Override
	public void wheels() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have wheels.");

	}

	@Override
	public void seat() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have seat.");

	}

	@Override
	public void handel() {
		// TODO Auto-generated method stub
		System.out.println("Bikes have handel.");

	}

	public static void main(String args[]) {
		javaInterfaceClass obj2= new javaInterfaceClass();
		obj2.engine();
		obj2.handel();
		obj2.seat();
		obj2.wheels();
		
	}
}
