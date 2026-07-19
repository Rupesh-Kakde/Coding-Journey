class Student
{
  public String name;
  public int Age;
  public int Marks;

  Student(String A, int B, int C)
  {
    this.name = A;
    this.Age = B;
    this.Marks = C;

  }
  public String toString()
  {
    return "Marvellous Pune";
  } 
}



public class ToStringStudent
{
    public static void main(String[] args)
    {
       Student sobj = new Student("Amit", 27, 98);
       
       System.out.println(sobj);
    }
    
}
