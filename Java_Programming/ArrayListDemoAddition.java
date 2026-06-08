import java.util.*;

public class ArrayListDemoAddition

{
   public static void main(String[] args) 
   {    
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        
        aobj.add(10);
        aobj.add(20);
        aobj.add(30);
        aobj.add(40);

        Iterator iobj = aobj.iterator();

        int isum = 0;


        while (iobj.hasNext())
          {
            isum = isum + (int)iobj.next();


        }
          System.out.println("Addition is :"+isum);

   } 
}
