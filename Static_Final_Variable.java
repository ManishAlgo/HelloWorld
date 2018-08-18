public class Static_Final_Variable
{
	public static void main(String args[])
	{
		System.out.println(Test.var);
		System.out.println(Test2.var);
	}
}

class Test
{
	public static final int var = 100;

	static{
		System.out.println("This will not called ...!!!");
	}

	/*
		<<This is the concept of JAVA COMPILER OPTIMIZATION>>
		Here static block will not be called, because comiler fix the 
		"static final(constant)"
		variables with its actul value, so there is not need to load the classs.
		And that's why static block of class Test is not called. 
	*/
}

class Test2 
{
	public static int var = 120;

	static 
	{
		System.out.println("this will be called before printing number....!!!");
	}
	/*
		This will be called, because here var is not constant. So comiler will
		load the class hence static block will be called.
	*/
}
