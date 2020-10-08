package myFirstJavaProgram;

public class classNamePrint {
	String name;
	classNamePrint(String name)
	{
		this.name = name;
	}
	
	public String toString ()
	{
		return "The name of the class is: " + this.name;
	}
}
