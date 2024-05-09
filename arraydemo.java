import java.util.Scanner;

/**
 * arraydemo
 */
public class arraydemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("how many records you want store");
        int n = s.nextInt();
        String name[] = new String[n];
        System.out.println("Enter the name");
        for(int i=0;i<=n;i++)
        {
            name[i] = s.nextLine();
        }
        for(int i=0;i<=n;i++)
        {
            System.out.println(name[i]);
        }
    }
}