class superdemo
{
    {
        System.out.println("hi from instant block");
    }
    
    static{
        System.out.println("hi from static block");
    }
}


class demotypesblock
{
    public static void main (String[] args) {
        superdemo sd = new superdemo();
        
    }
}
