class A
{
    public void reader()
    {
        System.out.println("check in");
    }
}
class B extends A
{
    public void reader()
    {
        super.reader();
        System.out.println("check out");
    }
}


public class demoupdowncasting
{
   public static void main(String[] sk)
   {
    //B b = new B();
    //A a = (A) b;
    A a = new B();
    //a.disp();
    B b = (B) a;//downcasting
    b.reader();

   } 
}