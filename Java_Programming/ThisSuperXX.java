

class Base
{
    public int i;
    

    public Base()
    {
        System.out.println("Inside Base Constructor");
        this.i = 11;
       
    }

    
    public void fun()
    {
        System.out.println("Inside Base Fun");
    }

    class Derived extends Base
    {
        public int i;

        public Derived()
        {
            System.out.println("Inside Derived Constructor");
            this.i = 21;
        }

        public void gun()
        {
            System.out.println("Inside Gun of Derived");
            System.out.println("Value of i : "+i);
            System.out.println("Value of i from base :"+super.i);
            
        }

    }
}
class ThisSuperX
{
    public static void main(String[] args) 
    {
        Derived dobj = new Derived();

       
}
}