public class RunWithoutMain
{
	public static void sayHello()
	{
		System.out.println("Hello world");
	}
	static
	{
		sayHello();
	}

	public static void main()
	{
		
	}
}