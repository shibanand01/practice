import java.util.Scanner;

class InvalidAgeException extends RuntimeException{
}
class G1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >17)
        {
            System.out.println("ok");
        }
        else{
            throw new InvalidAgeException();
        }
    }
}
