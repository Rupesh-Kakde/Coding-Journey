import java.util.*;

public class ArrayListDemoIterate

{
   public static void main(String[] args) 
   {    
        ArrayList <Float> aobj = new ArrayList <Float> ();

        
        aobj.add(90.67f);
        aobj.add(10.11f);
        aobj.add(11.67f);
        aobj.add(11.87f);

        Iterator iobj = aobj.iterator();

        while (iobj.hasNext())
          {
            System.out.println(iobj.next());

        }

        
   
     


   } 
}
