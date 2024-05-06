import java.util.Scanner;
class ex2()
{
	static int count;
	public ex2()
		{
			count++;
		}
	public static void main(String arg[])
		{	
			Scanner s = new Scanner(System.in);	
			int n;
			System.out.println("Enter the number of objects to be created");
			n = s.nextInt();
			ex2[] ob = new ex2[n];
			for(int i=0;i<n;i++)
				{
					ob[i] = new ex2();
				}
			System.out.println("The number of objects created in the class = "+count);
			

		}
}