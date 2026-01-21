/*Give an example of a Java code fragment that performs an array reference that
is possibly out of bounds, and if it is out of bounds, the program catches that
exception and prints the following error message:
“Don’t try buffer overflow attacks in Java!”*/

class Demo {
    public static void main(String[] args) {
        int [] arr = {23,34,55,67};

        try {
            for (int i = 0; i<= arr.length; i++)
            {
                arr[i]=0;
            }
        }
        catch(ArrayIndexOutOfBoundsException ie)
        {
            System.out.println("Don't try buffer overflow attacks in Java!");
        }
    }
}

/*If the parameter to the makePayment method of the CreditCard class (see Code
Fragment 1.5) were a negative number, that would have the effect of raising
the balance on the account. Revise the implementation so that it throws an
IllegalArgumentException if a negative amount is sent as a parameter.*/

public class CreditCard {
    // Instance variables:
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance; // name of the customer (e.g., ”John Bowman”)
    // name of the bank (e.g., ”California Savings”)
    // account identifier (e.g., ”5391 0375 9387 5309”)
    // credit limit (measured in dollars)
    // current balance (measured in dollars)
    // Constructors:
    public CreditCard(String cust, String bk, String acnt, int lim, double initialBal) {
        customer = cust;
        bank = bk;
        account = acnt;
        limit = lim;
        balance = initialBal;
    }
    public CreditCard(String cust, String bk, String acnt, int lim) {
        this(cust, bk, acnt, lim, 0.0); // use a balance of zero as default
    }
    // Accessor methods:
    public String getCustomer( ) { return customer; }
    public String getBank( ) { return bank; }
    public String getAccount( ) { return account; }
    public int getLimit( ) { return limit; }
    public double getBalance( ) { return balance; }
    // Update methods:
    public boolean charge(double price) { // make a charge
        if (price + balance > limit) // if charge would surpass limit
            return false; // refuse the charge
        // at this point, the charge is successful
            balance += price; // update the balance
            return true; // announce the good news
        }
    public void makePayment(double amount) { // make a payment
        if(amount<0)
        {
            throw new IllegalArgumentException("Invalid Amount Entered!!");
        }
        else
            balance-= amount;
        }
    // Utility method to print a card's information
    public static void printSummary(CreditCard card) {
        System.out.println("Customer = " + card.customer);
        System.out.println("Bank = " + card.bank);
        System.out.println("Account = " + card.account);
        System.out.println("Balance = " + card.balance); // implicit cast
        System.out.println("Limit = " + card.limit); // implicit cast
    }
    // main method shown on next page...
}
