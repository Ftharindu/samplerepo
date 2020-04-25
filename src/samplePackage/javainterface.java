package samplePackage;
//1. Create and interface
public interface javainterface {

	public void engine();
	public void wheels();
	public void seat();
	public void handel();
	
	public static void main(String args[])
	{
		javaInterfaceClass obj = new javaInterfaceClass();
		obj.engine();
		obj.handel();
	}
}
