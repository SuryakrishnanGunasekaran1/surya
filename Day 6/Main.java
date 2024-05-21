 class privateclass {
    private int s = 5;
    privateclass ()
    {
        System.out.println(s);
    }
    
}
 public class Main{
    public static void main(String[] args) {
        privateclass pc = new privateclass();
    }
}
