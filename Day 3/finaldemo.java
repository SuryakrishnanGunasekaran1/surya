class superdemo
{
    final int a = 5;
    final int b;
    static int c;
    final int arr[] = new int[]{1,2,3,4};
    final String str;
    final public void disp()
    {
        arr[2]=8;
        System.out.println("final fun is printed with final variable = "+a+" "+b + " "+c);
        System.out.println(arr[2]);
        System.out.println(str);
    }
    superdemo()
    {
        b = 6;
        str = "suryakrishnangunasekaran";
    }
    static
    {
        c=8;
    }
}
/* -----disp() in okaydemo cannot override disp() in superdemo
             
  overridden method is final-----
  
class okaydemo extends superdemo
{
    
    public void disp()
    {
        System.out.println("hello");
    }
}

*/
public class finaldemo
{
    public static void main(String[] sk)
    {
        superdemo sd = new superdemo();
        //okaydemo od = new okaydemo();
        //od.disp();
        sd.disp();
    }
}