import java.util.Scanner;
public class ScannerClassDemo
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your name please....");
		String name = sc.next();

		System.out.println("enter your age now..");
		int age = sc.nextInt();

		System.out.println("enter any alphabet from a to z ");
		char ch = sc.next().charAt(0);

		System.out.println("you have entered following information \n"+
			"name = "+name+"\n"+
			"age = "+age+"\n"+
			"char = "+ch);
	}
}