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
    return "Name: " + this.name + ", Age: " + this.Age + ", Marks: " + this.Marks;
  } 
}



public class ToStringStudentX
{
    public static void main(String[] args)
    {
       Student sobj = new Student("Amit", 27, 98);
       
       System.out.println(sobj);
    }
    
}
