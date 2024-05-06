
import java.util.Scanner;
class ex1
{
public void disp(int x)
   {
	if(x>299)
		{
			if(x>=999)
				{
					System.out.println("You have enough money to order Hoodies");
				}
			else if(x>=499 && x<999)
				{
					System.out.println("You can order Sweatshirts");
				}
			else
				{
					System.out.println("You may go for Supima");
				}
		}
	else 
		{
			System.out.println("Why don't you look on some Tees ");
		}
		
   }
public static void main(String arg[])
  {
	int x;
	ex1 ob = new ex1();
	Scanner s = new Scanner(System.in);
	System.out.println("what is the range of your products");
	x = s.nextInt();
	ob.disp(x);

  }
}