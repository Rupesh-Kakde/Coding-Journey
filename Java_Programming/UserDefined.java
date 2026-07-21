import java.util.Scanner;

class AgeInvalid extends Exception
{
    public AgeInvalid(String str)
    {
        super(str);
    }
}
public class UserDefined 
{
    public static void main(String[] args) 
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter Your Age :");
        int Age = sobj.nextInt();

        try
        {
        if(Age<18)

            {
                throw new AgeInvalid("You are under Age");
            }
            else
            {
                System.out.println("You can Attend the Session");
            }
        }
        catch(AgeInvalid aobj)
        {
            System.out.println("Inside Catch :"+aobj);
        }
    }
}
