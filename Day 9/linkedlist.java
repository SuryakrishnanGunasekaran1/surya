import java.util.*;
import java.util.Iterator;

class linkedlistdemo
{
    LinkedList<String> emp = new LinkedList<>();
    
    public void getdata()
    {
    emp.add("kripa");
    emp.add("prasath");
    emp.add("harish");
    emp.add("kabilan");
    emp.add("benji");
    emp.add("lokesh");
    } 
    public void fetch_data()
    {
        Iterator i = emp.iterator();
        while(i.hasNext())
        System.out.println(i.next());
    }
    public void sfun()
    {
        emp.addFirst("kavi");
        emp.addLast("thanush");
        System.out.println(emp.getFirst());
        System.out.println(emp.getLast());
        emp.removeFirst();
        emp.removeLast();
    }
    public void otherstuff()
    {
        emp.set(5,"surya");
        System.out.println(emp.get(5));
        emp.clear();
        System.out.println(emp.size());
    }
}
public class linkedlist {
    public static void main(String[] args) {
        linkedlistdemo lld = new linkedlistdemo();
        lld.getdata();
        lld.fetch_data();
        lld.sfun();
        lld.otherstuff();
    }
    
}
