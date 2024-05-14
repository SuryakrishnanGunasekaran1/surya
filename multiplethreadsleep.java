class sample extends Thread
{
    
    public void run()
    {
        try{
           String str ="suryakrishnangunasekaran";
           char[] ca = str.toCharArray();
        for(int i=0;i<ca.length;i++)
        {
            Thread.sleep(410);
            System.out.print(ca[i]);
        }

       }
       catch(Exception e)
       {
        System.out.println(e);
       }
       
}
}

public class multiplethreadsleep {
    public static void main(String[] args) {
      
        sample s = new sample();
        s.start();
        try{
         
        for(int i=0;i<25;i++)
        {
            Thread.sleep(400);
            System.out.print("*");
        }

       }
       catch(Exception e)
       {
        System.out.println(e);
       }
        

    }
    
}
