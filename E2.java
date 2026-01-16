class BankAccount{
    private long balance;
    BankAccount(long balance){
        this.balance = balance;
    }

    public void diposit(long amt)
    {
        balance = balance + amt;
    }
    public void withdraw(long amt)
    {
        if (balance-amt >= 0)
            balance= balance - amt;
        else 
            System.out.println("Insufficient balance");
    }
    public void getBalance(){
        System.out.println(balance);
    }
}
class BankManager{
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(2004);
        b1.diposit(31000);
        b1.diposit(344020032);
        b1.withdraw(1000000);
        b1.getBalance();
    }
}