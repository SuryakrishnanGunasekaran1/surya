class okdemo
{
    // static variable in the constructor cannot be overriden
    
    okdemo()
    {
        static int s = 5;
        s = 8;
        System.out.println(s);
    }
    static void disp()
    {
        System.out.println("lgf");
    }
}


/* isp() in superdemo cannot override disp() in okdemo
    public void disp()
                ^
  overridden method is static
        */

class superdemo extends okdemo
{
    public void disp()
    {
        System.out.println("gfy");
    }
}


public class staticnotoverriden
{
    public static void main(String[] sk)
    {
        superdemo sd = new superdemo();
        sd.disp();
        
    }
}
