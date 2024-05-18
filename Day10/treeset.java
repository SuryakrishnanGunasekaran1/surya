import java.util.Collection.*;
import java.util.*;
import java.util.Iterator;
class demotreeset
{
    
        TreeSet<String> ts = new TreeSet<>();
    {
        ts.add("mazda");
        ts.add("bmw");
        ts.add("ferari");
        ts.add("lexus");
        ts.add("volvo");
    
    }
    void disp()
    {
        Iterator it = ts.iterator();
        while(it.hasNext())
        System.out.println(it.next());
    }

}

public class treeset {
    public static void main(String[] args) {
       demotreeset dts = new demotreeset();
       dts.disp(); 
    }
    
}
