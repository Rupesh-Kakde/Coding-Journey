import java.util.Scanner;

class DynamicMemory
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;

        System.out.println("Enter No of Elements :");
        Size = sobj.nextInt();

        //Dynamic Memory Allocation

        float marks[] = new float [Size];

        //Use the Memory
         marks = null;

         System.gc();
        


    }
}