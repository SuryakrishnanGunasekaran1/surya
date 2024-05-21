class demo extends Thread
{
    public void run()
    {
        try{
            for(int i=0;i<5;i++)
        {
            System.out.println(Thread.currentThread().getName());
            Thread.sleep(1000);
        }
    }catch(Exception e){System.out.println(e);}
}
}

public class multiplethread3
{
    public static void main(String[] sk)
    {
        demo d1 = new demo();
        demo d2 = new demo();
       
        d1.setName("sk");
        d2.setName("gr");
        d1.start();
        d2.start();
    }
}