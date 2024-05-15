 class demoprotected
{
    int antutu;
    String processor;

    protected demoprotected(int x, String y)
    {
        antutu = x;
        processor = y;
        this.fun();
    
    }
    protected void fun()
    {
        System.out.println("model - "+antutu);
        System.out.println("processor name - "+processor);
    }
}
class demoprotected2 extends demoprotected
{
    int antutu2;
    String processor2;
    protected demoprotected2( int x, String y)
    {
        super(x, y);
        antutu2 = x;
        processor2 = y;
        this.fun2();

    }
    void fun2()
    {
        System.out.println("model - "+antutu2);
        System.out.println("processor name - "+processor2);
    }

}

public class protectedclass {
    public static void main(String[] args) {
        demoprotected dp = new demoprotected(1409874,"snapdragon 690");
        demoprotected dp2 = new demoprotected(5678544,"snapdragon 7 gen");

    }
    
}
