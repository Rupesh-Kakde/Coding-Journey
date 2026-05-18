class Demo extends Thread
{
    public void run()
    {
        System.out.println("Inside Run Method of : "+Thread.currentThread().getName());
    }
}


public class MultiThreadingName
{
    
    public static void main(String[] args) 
    {
        System.out.println("Main Thread is Running....");

        Demo dobj1 = new Demo();
        Demo dobj2 = new Demo();

        dobj1.setName("First");
        dobj2.setName("Second");

        dobj1.start();
        dobj2.start();
        
        
    
    }
}
