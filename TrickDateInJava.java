import java.text.*;

import java.util.Date;
public class TrickDateInJava
{
	public static void main(String args[])
	{
		SimpleDateFromat sdf = new SimpleDateFromat("dd/MM/yyyy");
		SimpleDateFromat sdf2 = new SimpleDateFromat("yyyy/MM/dd");

		Date date = sdf.parse("31/1/2016");

		System.out.println(date);


	}
}
