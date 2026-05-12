import java.util.Scanner;

class DynamicMemoryIO
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);
        int Size = 0;
        int  i = 0;



        System.out.println("Enter No of Elements :");
        Size = sobj.nextInt();

        //Dynamic Memory Allocation

        float marks[] = new float [Size];

        //Use the Memory
         marks = null;
         System.out.println("Entered your Marks : ");
         
         for(i=0; i<Size; i++)
         {
            marks[i] = sobj.nextFloat();   
         }

         System.out.println("Entered Marks are :");

         for(i=0; i<Size; i++)
         {
            System.out.println(marks[i]);  
         }

         marks = null;
         System.gc();
        


    }
}