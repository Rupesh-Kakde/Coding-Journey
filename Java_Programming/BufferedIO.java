import java.io.*;
public class BufferedIO
 {
    public static void main(String[] args) 
    {
        BufferedReader bobj = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter YOur Name");
        String name = bobj.readLine();      //checked Exception

        System.out.println("Hello "+name);
    }
}
