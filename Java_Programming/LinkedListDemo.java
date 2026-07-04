import java.util.*;

public class LinkedListDemo

{
   public static void main(String[] args) 
   {    
        LinkedList <Integer> lobj = new LinkedList <Integer> ();

        
        lobj.add(10);
        lobj.add(20);
        lobj.add(30);
        lobj.add(40);

        
          System.out.println(lobj);
          if (lobj.contains(121)) 
            {
              System.out.println("121 is present in the list");
          }
          else
          {
            System.out.println("121 is not present in the List");
          }

          Iterator iobj = lobj.iterator();

          while(iobj.hasNext())
          {
            System.out.println();
          }

   } 
}
