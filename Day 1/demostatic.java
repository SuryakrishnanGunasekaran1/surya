class demo 
{
    static int a = 5;
    static String s = "sk";

    
    static void fun()
    {
        System.out.println("surya");
    }
    
}

public class demostatic {
    public static void main(String[] args) {
        demo d = new demo();
     System.out.println(demo.a);
     System.out.println(demo.s);
     demo.fun();   
    }
}

