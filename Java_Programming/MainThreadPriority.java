
public class MainThreadPriority
{
    
    public static void main(String[] args) 
    {
        System.out.println("Inside Main Method");

        Thread tobj = Thread.currentThread();    

        String name = tobj.getName();

        System.out.println("Name of Current thread :"+name);

        System.out.println("Priority of thread is: "+tobj.getPriority());       //5 
        

        
    }
}
