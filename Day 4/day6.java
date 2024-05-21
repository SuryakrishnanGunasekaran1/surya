import java.util.*;

class sdemo
{
String password = "surya@2024";
public void check(String pass)
{
	if(pass.equals(password))
    {
    System.out.println("your password is correct");
    }
    else 
    {
    System.out.println("you entered a wrong password");
    }
}
}

class checkpass
{
public static void main(String[] gsk)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the password");
String pass = s.nextLine();
sdemo ob = new sdemo();
ob.check(pass);

}
}