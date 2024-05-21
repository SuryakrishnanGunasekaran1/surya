import java.util.Scanner;

/**
 * arraydemo
 */
 class arraydemo {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
       
        int n = 5; 
        String[] name = new String[n];
        String[][] car = new String[3][4];
       System.out.println("Enter the name");
        for(int i=0;i<5;i++)
        {
            name[i] = s.nextLine();
        }
        for(int i=0;i<5;i++)
        {
            System.out.println(name[i]);
        }  
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                car[i][j] = s.nextLine();
            }
        }
         for(int i=0;i<3;i++)
        {
            for(int j=0;j<4;j++)
            {
                System.out.print(car[i][j] + "\t");
            }
            System.out.println(" ");
        }
        // Jagged array
       char city[][] = new char[3][];
       city[0] = new char[5];
       city[1] = new char[4];
       city[2] = new char[1];
        city[0][0] ='s' ;
        city[0][1]= 'u';
        city[0][2]= 'r';
        city[0][3]='y';
        city[0][4]='a';
        city[1][0]='k';
        city[1][1]='r';
        city[1][2]='i';
        city[1][3]='s';
        city[2][0]='G';
       
            {
                System.out.println(city[0][0]);
            }
       
       
    }
}