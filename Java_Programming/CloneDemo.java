class Student implements Cloneable

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

  public Object clone() throws CloneNotSupportedException
  {
    return super.clone();
  }
}



public class CloneDemo 
{
    public static void main(String[] args) throws Exception
    {
       Student sobj = new Student("Amit", 27, 98);
       Student sobjX = (Student)sobj.clone();

       System.out.println(sobj);
       System.out.println(sobjX);

       System.out.println(sobj.hashCode());
       System.out.println(sobjX.hashCode());
    }
    
}
