interface I1
{
public void  keyboard();
}
/**
 *  I2

 */
interface  I2 
{
public void keyboard();
    
}

class demo implements I1{
    public void keyboard()
    {
        System.out.println("i help you to communicate with monitor");
    }
}

class interfacedemo2 {
    public static void man(String[] gsk)
    {
        demo d1 = new demo();
        d1.keyboard();
    }
    
}
