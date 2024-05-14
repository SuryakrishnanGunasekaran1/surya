

public class threaddemo extends Thread {
    public static void main(String[] args) {
       try{
           String str ="suryakrishnan";
           char[] ca = str.toCharArray();
        for(int i=0;i<ca.length;i++)
        {
            Thread.sleep(100);
            System.out.print(ca[i]);
        }

       }
       catch(Exception e)
       {
        System.out.println(e);
       }
        

    }
    
}
