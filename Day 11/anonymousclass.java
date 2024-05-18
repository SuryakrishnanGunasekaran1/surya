abstract class lenovo
{
    public abstract void legion();
    
}

 class anonymousclass  {
    public static void main(String[] args) {
        new Thread(){
            public void run(){
                System.out.println("lfg");
            }

        }.start();
        lenovo l = new lenovo() {
            public void legion()
            {
                System.out.println("powerful processor");
            }
        };
        
        l.legion();
    }
    
}
