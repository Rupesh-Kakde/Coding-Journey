
public class MainThread 
{
    
    public static void main(String[] args) 
    {
        System.out.println("Inside Main Method");

        Thread tobj = Thread.currentThread();       //je aahe to check kru

        String name = tobj.getName();

        System.out.println("Name of Current thread :"+name);
        

        
    }
}
