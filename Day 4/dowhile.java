import java.util.*;
class dowhiledemo
{
    public void disp(int x)
    {
        if(x>0)
        {
            do
        {
            System.out.println("loop");
        }while(true);
    }
}
}


public class dowhile
{
    public static void main(String[] gsk)
    {
        Scanner s = new Scanner(System.in);
        dowhiledemo dw = new dowhiledemo();
        int x = s.nextInt();
        dw.disp(x);
    }
}
