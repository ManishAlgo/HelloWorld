public class Manu 
{
	public static void main(String arg[])
	{
		int starcounter=1;
		int spacecounter=3;

		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<spacecounter;i--)
			{
				System.out.print("");
			}
			for(int k=0;k<starcounter;k++)
			{
				System.out.print("*");
			}
			starcounter = starcounter +2;
			spacecounter = spacecounter-1;
			System.out.println();
		}
	}
}