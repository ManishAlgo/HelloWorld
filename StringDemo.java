public class StringDemo
{
	public static void main(String args[])
	{
		String s1 = "java";
		String s2 = "java";

		System.out.println(s1==s2);

		s1 = s1 + " ee";

		System.out.println(s1==s2);
	}
}