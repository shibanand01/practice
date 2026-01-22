class Counter{
    int count;
    public synchronized void increment(){
        count++;
    }
}
class Demo
{
    public static void main(String[] args) throws InterruptedException{
        Counter c = new Counter();
        Runnable a1 = () -> 
        {
            for (int i =1; i< 10001; i++)
            {
                c.increment();
            }
        };
        Runnable b1 = () ->
        {
            for (int i =1; i< 10001; i++)
            {
                c.increment();
            }
        };

        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(b1);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(c.count);

    }
}
