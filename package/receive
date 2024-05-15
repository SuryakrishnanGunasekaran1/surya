import getdata.*;//info;
import getdata.attendance.*;
public class receive extends info implements presence{
    public receive(float sal,float pf)
    {
        super(sal, pf);
    }
   
    public void disp()
    {
        System.out.println(super.name);
        System.out.println(super.role);
        System.out.println(super.id);
        System.out.println(sal);
        System.out.println(pf);
        super.disp();
    }
    public void present()
    {
        System.out.println("Total number of present day is 190");
    }
    public void absent()
    {
        System.out.println("Total number of absence is 10");
    }
}
 class Main{
    public static void main(String[] args) {
        receive r = new receive(27400.4f,2500.4f);
        r.disp();
        r.absent();
        r.present();
    }
}
