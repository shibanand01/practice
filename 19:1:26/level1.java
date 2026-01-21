import java.util.InputMismatchException;
import java.util.Scanner;

class Q1 {
    public static void main(String[] args) {
        
        try(Scanner scan = new Scanner(System.in)){
            int num = scan.nextInt();
            if (num%2 != 0)
            {
                throw new IllegalArgumentException("Odd numbers not allowed !!");
            }
            else System.out.println("Even Number!!");
        }
    }
}

class Q2{
    public static void main(String[] args) {
        int [] arr = {1, 32, 4345 , 54};

        try (Scanner scan = new Scanner(System.in))
        {
            int index = scan.nextInt();
            System.out.println(arr[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Invalid index");
        }
        catch (InputMismatchException e)
        {
            System.out.println("Please enter valid Numbers!!");
        }
        
    }
}

class Q3{
    public static void main(String[] args) {
        try {
            System.out.println(10/2);
            // throw new ArithmeticException();
        }
        finally{
            System.out.println("Finally");
        }
    }
}

class Q4 {
    private String message;
    Q4()
    {
        this.message = null;
    }
    Q4(String s)
    {
        this.message = s;
    }
    String getMessage()
    {
        return message;
    }
    void check(){
        //checks if message is Null
        String ch = this.getMessage();
        if (ch==null)
        {
            throw new NullPointerException("String parameter is null!!");
        }
        else
            System.out.println(this.getMessage());
    }

    public static void main(String[] args) {
        Q4 a = new Q4();
        Q4 b = new Q4("all good!!");

        b.check();
        a.check();
    }
}