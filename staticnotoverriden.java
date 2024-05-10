class okdemo
{
    
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