import java.util.Iterator;
import java.util.Vector;

class VectorDemo 
{
    public static void main(String[] args)
     {
        
        Vector <Double> vobj = new Vector <Double> ();

        vobj.add(10.5);
        vobj.add(20.5);
        vobj.add(30.5);
        vobj.add(40.5);
        vobj.add(50.5);

        System.out.println(vobj);

        vobj.remove(2);

          System.out.println(vobj);

          Iterator iobj = vobj.iterator();


          while (iobj.hasNext()) 
            {
             System.out.println(iobj.next());
            }

            vobj.clear();
    }
}