interface phone
{
public void call();
}

class interfaceobject
{
	public static void main(String[] sk)
    {
    phone p = new phone()
    
    {
    public void call()
    {
    System.out.println("lfg");
    }
    };
    p.call();
    }
}