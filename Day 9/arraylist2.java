   import java.util.Iterator;
   import java.util.ArrayList;
   class arraylist2
   {
    public static void main(String[] args) {
        
    ArrayList<String> name = new ArrayList<String>();
    
    name.add("bmw");
    name.add("audi");
    name.add("mercedes");
    name.add("bucati");
    name.add("supera");
    name.add("jaguar");
   
    long s1 = System.nanoTime();

    for(String i : name)
        System.out.println(i);
    System.out.println("**********");

    long e1 = System.nanoTime();
    long d1 = e1-s1;
       
    long s2 = System.nanoTime();
        Iterator it = name.iterator();
        while(it.hasNext())
        System.out.println(it.next());
    System.out.println("**********");
    long e2 = System.nanoTime();
    long d2 = e2-s2;

    long s3 = System.nanoTime();
        for(int i=0;i<name.size();i++)
        {
            System.out.println(name.get(i));
        }
    System.out.println("**********");
    long e3 = System.nanoTime();
    long d3 = e3-s3;

    System.out.println("for each duration - "+d1);
    System.out.println("iterator duration - "+d2);
    System.out.println("for loop duration - "+d3);
    }
}