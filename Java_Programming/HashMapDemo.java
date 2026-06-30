import java.util.HashMap;
import java.util.Hashtable;

public class HashMapDemo
 
{
    public static void main(String[] args)
     {
        HashMap <String, Integer> hobj = new HashMap <String, Integer> ();

        hobj.put("PPA", 27000);
        hobj.put("LB", 28000);
        hobj.put("PYTHON", 30000);
        hobj.put("LB", 28500);

        System.out.println(hobj.get("PYTHON"));
        System.out.println(hobj.get("PPA"));
        System.out.println(hobj.get("LB"));

        System.out.println(hobj);


    }
}
