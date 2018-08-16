public class StaticVariables
{
	public static String myName = "manish";

	public static void main(String args[])
	{
		StaticVariables s1 = new StaticVariables();
		StaticVariables s2 = new StaticVariables();
		StaticVariables s3 = new StaticVariables();

		System.out.println(s1.myName);
		System.out.println(s2.myName);
		System.out.println(s3.myName);

		s1.myName = "neeraj";

		System.out.println(s1.myName);
		System.out.println(s2.myName);
		System.out.println(s3.myName);

	}
}