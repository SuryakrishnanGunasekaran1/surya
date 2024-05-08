
class A
{
    public void ac()
    {
        System.out.println("ac is turned on");
    }
}

class B extends A
{
    public void ac(String x)
    {
        System.out.println("ac is turned "+x);
    }
}

class C extends B
{
    public void ac()
    {
        super.ac();
        super.ac("off");
        System.out.println("swing turned on");
    }
}

public class demopolymorphism
{
    public static void main(String[] sk)
    {
        //A a = new A();
        //A b = new B();
        A c = new C();
        //a.ac();
        //b.ac();
        c.ac();
    }
}