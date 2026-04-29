import java.util.*;

public class ArrayIndexException
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,21,51,101,111};

        System.out.println("Enter the Index of Array :");
        int Index = sobj.nextInt();
try{
        System.out.println("Inside Try Block");
        System.out.println("Element at that Index is :"+Arr[Index]);

}
catch(ArrayIndexOutOfBoundsException aobj)
{
    System.out.println("Exception Occured :"+aobj);
}
        System.out.println("End OF Application");



    }
}
