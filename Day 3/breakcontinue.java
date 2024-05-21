public class breakcontinue {
    public static void main(String[] sk)
    {
        char name[] = new char[5];
        name[0] ='a';
        name[1] ='b';
        name[2] ='e';
        name[3] ='c';
        name[4] ='d';


        for(int i=0;i<name.length;i++)
        {
            if(i=='e')
            break;
           System.out.print(i);
        }
        System.out.print("\n");

        for(int i=0;i<name.length;i++)

        {
            if(i=='e')
            continue;
            System.out.print(i);
        }
        System.out.print("\n");

    }
    
}
