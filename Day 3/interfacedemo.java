interface computer
{
    public void compiler();
    public void troubleshooting();
    String str = "suryakrishnangunasekaran";
}
interface cpu
{
    public void process();
}
class superdemo implements computer
{
  
    superdemo()
    {
        System.out.println(str);
    }
    public void compiler()
    {
        System.out.println("i can run the system");
    }
    public void troubleshooting()
    {
        System.out.println("i can help you to fix the system");
    }
    
}
class okdemo implements cpu
{
      public void troubleshooting()
    {
        System.out.println("i can help you to fix the system");
    }
    
     public void process() //compiler()
    {
        System.out.println("notify from the cpu");
    }
}
class goodemo extends okdemo
{
    public void process()
    {
        System.out.println("notify from the second cpu");
    }
      public void troubleshooting()
    {
        System.out.println("i can help you to fix the system");
    }
}

public class interfacedemo
{
    public static void main(String[] sk)
    {
    superdemo s = new superdemo();
    s.compiler();
    s.troubleshooting();
    okdemo o = new okdemo();
    o.process();
    o.troubleshooting();
    goodemo g = new goodemo();
    g.process();
    g.troubleshooting();
}
}