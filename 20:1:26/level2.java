import java.io.IOException;

class Q5 {
    public static void main(String[] args) {
        try{
            throw new ArithmeticException();
        }
        finally{
            throw new RuntimeException();
        }
    }
}
class Q6{
    public static void main(String[] args) {
        try {
            throw new ArithmeticException();
        }
        catch (Exception e){
            System.out.println("handled");
        }
        // catch (ArithmeticException ae)
        // {
        //     System.out.println("handled");
        // }

    }
}

class Q7{
    public static void m1() 
    {
        throw new ArithmeticException(); //wont be allowed as IOException is an checked exception so we need to
    }
    public static void main(String[] args) throws Exception {
        m1();
    }
}

class Q8{
    public static int m1()
    {
        try {
            // throw new ArithmeticException();
            System.out.println("no p");
            return 12;
        }
        catch(ArithmeticException ae)
        {
            System.out.println("handled");
            return 12;
        }
        finally {
            return 10;
        }
    }
    public static void main(String[] args) {
       System.out.println(m1());
    }
}