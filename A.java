import java.util.Scanner;

class A1 {
    public static double calc(double Price, double Discount)
    {
        double discount = (Price*Discount)/100;
        double amount = Price - discount;
        // int round_amt = (int)(amount*100);
        // amount =(double) round_amt/100;

        return amount;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Price = scan.nextDouble();

        double Discount = scan.nextDouble();

        System.out.printf("%.2f",calc(Price,Discount));
    }
}

class A2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int Num = scan.nextInt();

        if(Num%2 == 0)
            System.out.println("Even");
        else    System.out.println("Odd");
    }
}