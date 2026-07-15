class Demo implements Runnable
{
    public void run()
    {
        System.out.println("Inside Run Method");
    }
}


public class ThreadScenario1X
{
    
    public static void main(String[] args) 
    {
        System.out.println("Main Thread is Running....");

        Demo dobj = new Demo();
        
        Thread tobj = new Thread(dobj);

        tobj.start();
        
        
        
    
    }
}
