import java.util.*;

public class ArrayListDemo

{
   public static void main(String[] args) 
   {    
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);
        aobj.add(111);

        System.out.println(aobj);

        aobj.add(0, 5);


   } 
}
