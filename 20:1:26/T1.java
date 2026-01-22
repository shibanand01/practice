class Test extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
    public static void main(String[] args) throws InterruptedException{
        Test t1 = new Test();
        hello h1 = new hello();

        t1.start();
        h1.start();
        Thread.sleep(1000);
        System.out.println(Thread.currentThread().getName());
    }
}
class hello extends Thread{
    public void run()
    {
        System.out.println(Thread.currentThread().getName());
    }
}

