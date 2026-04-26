import java.util.*;

public class ArrayIndex
 {
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        int Arr[] = {11,21,51,101,111};

        System.out.println("Enter the Index of Array :");
        int Index = sobj.nextInt();

        System.out.println("Element at that Index is :"+Arr[Index]);

        System.out.println("End OF Application");



    }
}
