import java.util.Scanner;
public class protected2main {
   // protected2 p;s

    public static void main(String[] gsk)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the userid"); 
        String uid = s.nextLine(); 
        System.out.println("Enter the passsword"); 
        String pwd = s.nextLine();
        protected2 pobj = new protected2(uid, pwd);
    }
    
}
