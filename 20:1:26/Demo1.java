class Demo1 {
    public static void main(String [] args)
    {
        Thread a1 = new Thread(() -> {
            for(int i = 1; i< 11; i++)
            {
                System.out.println("hello");
            }
        });
        Thread b1 = new Thread(() -> {
            for(int i = 1; i< 11; i++)
            {
                System.out.println("hii");
            }
        });

        a1.start();
        b1.start();
    }
}
