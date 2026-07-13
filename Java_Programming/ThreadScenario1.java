class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method");
    }
}


public class ThreadScenario1
{
    
    public static void main(String[] args) 
    {
        System.out.println("Main Thread is Running");

        Demo dobj = new Demo();
        
        dobj.start();
    }
}
