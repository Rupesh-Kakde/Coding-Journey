import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemoXX
 
{
    public static void main(String[] args)
     {
        Hashtable <String, Integer> hobj = new Hashtable <String, Integer> ();

        hobj.put("PPA", 27000);
        hobj.put("LB", 28000);
        hobj.put("PYTHON", 30000);
        hobj.put("LB", 28500);


        Enumeration eobj = hobj.keys();

        while (eobj.hasMoreElements()) 
            
        {
            System.out.println(hobj.get(eobj.nextElement()));
        }

    }
}
