class Marvellous
{}

class Hello
{}


public class HashCodeDemo 
{
    public static void main(String[] args)
    {
       Marvellous mobj = new Marvellous();
       Hello hobj = new Hello();
       
       System.out.println(mobj.hashCode());
       System.out.println(hobj.hashCode());
    }
    
}
