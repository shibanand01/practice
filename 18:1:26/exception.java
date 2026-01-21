import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

class Exceptional {
    public static void main(String[] args) {
        try {
            System.out.println(100/0);
        }
        catch(ArithmeticException E){
            System.out.println("Handled");
        }
        catch(Exception w)
        {
            System.out.println("done");
        }
    }
}
class Demo {
    void m1 () throws Exception 
    {
        throw new IOException();
    }
}
class Test extends Demo{
    void m1() throws ClassNotFoundException
    {
        throw new ClassNotFoundException();
    }
    public static void main(String[] args) {
        
    }
}
class Miks
{
    public static void main(String[] args) {
        try {
            throw new Exception("abc");
        }
        catch(Exception e)
        {
            System.out.println("catch block executed!!");
        }
        finally{
            System.out.println("finally");
        }
    }
}
class Hello{
    public static void main(String[] args) throws IOException {
        try {
            throw new IOException();
        }
        finally{
            System.out.println("finally");
        }
    }
}
class Resources {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }
        catch (ArithmeticException c ){
            System.out.println("hello");
            System.out.println(10/0);
        }
        catch(Exception e){
            System.out.println("done");
        }
    }
}