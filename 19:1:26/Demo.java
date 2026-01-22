class A extends Thread
{
    public void run()
    {
        for (int i = 1; i<11; i++)
        {
            System.out.println("Hii");
        }
    }
}
class B extends Thread
{
    public void run()
    {
        for (int i =1; i< 11; i++)
        {
            System.out.println("hello");
        }
    }
}
class Demo {
    public static void main(String[] args) throws InterruptedException {
        A a1 = new A();
        B b1 = new B();
        a1.setPriority(10);
        b1.setPriority(1);

        a1.start();
        b1.start();
        Thread.sleep(4000);
        System.out.println("happy");
    }
}
