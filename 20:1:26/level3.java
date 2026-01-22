import java.util.Scanner;

class InsufficientBalanceException extends Exception{
}
class Q9 {
    double balance;
    int amount;

    public static void main(String[] args) throws InsufficientBalanceException{
        Q9 cust1  = new Q9();
        cust1.balance = 20000;
        Scanner scan = new Scanner(System.in);
        cust1.amount = scan.nextInt();

        if (cust1.amount > 20000)
        {
            throw new InsufficientBalanceException();
        }

    }
}

class Q10{
    public static void read() throws Exception{
        Scanner Scan = new Scanner(System.in);
        String input = Scan.nextLine();
    }
    public static void main(String[] args) {
        
    }
}

class Account{
    String name;
    double Balance;

    Account(String n, int bal)
    {
        this.name = n;
        this.Balance = bal;
    }

    public double deposit(int Amount){
        if (Amount<0)
        {
            throw new IllegalArgumentException();
        }
        else{
            Balance = Balance + Amount;
            return Balance;
        }
    }

    public double withdraw(int Amount) throws InsufficientBalanceException{
        if(Amount > Balance)
        {
            throw new InsufficientBalanceException();
        }
        else {
            Balance = Balance-Amount; 
            return Balance;
        }
    }
}
class Q11{
    public static void main(String[] args)throws Exception {
        Account cust1 = new Account("Shiv",3200000);
        cust1.deposit(-21000);
        cust1.withdraw(4000000);
    }
}