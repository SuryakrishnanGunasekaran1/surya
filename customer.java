class democustomer
{
    String name;
    long phone;
    int amount;
    product prod;

    democustomer(String name, long phone,int amount, product prod)
    {
        this.name = name;
        this.phone = phone;
        this.amount = amount;
        this.prod = prod;
    }
    
    
    void display()
    {
        System.out.println(name + "\n" + phone + "\n" + amount);
        System.out.println(prod.pname + "\n" + prod.size + "\n" + prod.quantity);
    }
}
public class customer {
    public static void main(String[] args) {
        product prod1 = new product("sweatshirts",1,'l');
        product prod2 = new product("oversized t shirts",1,'m');
        
        democustomer dc = new democustomer("surya", 987654321, 4679,prod1);
        democustomer dc2 = new democustomer("krishnan", 876543210, 3965,prod2);
        
        dc.display();
        dc2.display();
      
    }

    
}
