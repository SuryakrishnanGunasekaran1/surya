import java.util.Scanner;
class ex3
{
		static double htemp = 25.1;
		static double ctemp;
		static boolean ac;
		
     public void check()
		{
			if(ctemp >= htemp)
				{
					ac = true;
					System.out.println("Ac is turned on");
				}
			else
				{
					ac = false;
					System.out.println("Ac is turned off");
				}
		}
	public static void main(String arg[])
		{
		    
		    ex3 ob = new ex3();
			Scanner s = new Scanner(System.in);
			System.out.println("Enter the current temperature");
			ctemp =s.nextDouble();
			ob.check();
		}
}