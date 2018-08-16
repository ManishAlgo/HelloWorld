public class CheckBlocksWorking
{
	static
	{
		System.out.println("i am inside static block");
	}
	{
		System.out.println("i am inside instance block");
	}
	public static void main(String args[])
	{
		CheckBlocksWorking obj = new CheckBlocksWorking();
	}
}