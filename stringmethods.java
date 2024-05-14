import java.util.*;

class smdemo
{
String str1,str2;

smdemo(String str1,String str2)
    {
        this.str1 = str1;
        this.str2 = str2;
    }
public void disp()
{
    int c;
    Scanner ci = new Scanner(System.in);
   do{
       System.out.println("*****************");
        System.out.println("1.concatenation");
        System.out.println("2.compare");
        System.out.println("3.equals");
        System.out.println("4.length");
        System.out.println("5.substring");
        System.out.println("6.exit");
        System.out.println("*****************");
        System.out.println("choose any string methods");
        c = ci.nextInt();
    switch(c)
   {
    case 1:
    {
        System.out.println("The concatenation of two string " + str1.concat(str2));
        break;
    }
    case 2:
    {
        System.out.println("the comparison of two string is " + str1.compareTo(str2));
        break;
    }
    case 3:
    {
        System.out.println("equals of two strings is "+ str1.equals(str2));
        break;
    }
    case 4:
    {
        System.out.println("the length of the str1 is "+ str1.length());
        break;
    }
    case 5:
    {
        System.out.println("the substring of string one is "+ str1.substring(5));
        break;
    }
    case 6:
        break;
}
   }while(c>0 & c<6);
}
}

public class stringmethods {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pstr1,pstr2;
        System.out.println("enter the string one");
        pstr1 = s.nextLine();
        System.out.println("enter the string two");
        pstr2 = s.nextLine();
        smdemo sd = new smdemo(pstr1,pstr2);
        sd.disp();
    }
}
