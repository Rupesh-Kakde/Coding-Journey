class Marvellous
{
    public Marvellous()
    {
        System.out.println("Inside Marvellous constructor");
    }

    protected void finalize()
    {
        System.out.println("Inside finalize method");
    }
}



public class FinalizeDemo 
{
    public static void main(String[] args)
    {
       Marvellous mobj = new Marvellous();

       mobj = null;
      
        System.gc();

        System.out.println("End of main");
    }
    
}
