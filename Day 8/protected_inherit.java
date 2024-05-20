import java.util.Scanner;

class demoprot1
{
    String name;
    int quantity;
    double price;
    protected void getinfo()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name");
        name = s.nextLine();
        System.out.println("Enter the quantity");
        quantity = s.nextInt();
        System.out.println("Enter the price");
        price = s.nextDouble();
        
        
    }
    protected void printbill()
    {
        System.out.println(" customer name - "+name + "\n no of quantity - " + quantity + "\n total bill - " + (quantity*price));
        System.out.println("--------------------------");
    }
}
class demoprot2 extends demoprot1
{
    protected void printbill()
    {
        super.printbill();
    }
}

public class protected_inherit {
    public static void main(String[] args) {
        demoprot2 dp2 = new demoprot2();
        dp2.getinfo();
        dp2.printbill();
        
    }
    
}
