import java.util.Scanner;

class G{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inp1 = sc.nextInt();
        int inp2 = sc.nextInt();
        try
        {
            int out = inp1/inp2;
            System.out.println(out);
        }
        catch (ArithmeticException E){
            System.out.println("Division by zero not allowed");
        }
    }
}