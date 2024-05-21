class demothis
{
    int price;
    String product ;
    String type;
   demothis()
   {
       this(600,"supima" ,"pink");
   }
    demothis(int price,String product, String type)
    {
            this.price = price;
            this.product = product;
            this.type = type;
    }
    public void bill()
    {
        
        System.out.println(price);
        System.out.println(product);
        System.out.println(type);
    }
}



public class thisconstructor {
    public static void main(String[] args) {
        demothis d = new demothis();
        d.bill();
        System.out.println("----------------------------");
        demothis d1 = new demothis(699,"Men wear" , "Hoodies");
        d1.bill();
        System.out.println("----------------------------");
        demothis d2 = new demothis(559,"kid wear","Tees");
        d2.bill();
        System.out.println("----------------------------");
    }
    
}
