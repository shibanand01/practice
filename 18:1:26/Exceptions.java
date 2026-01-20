public class Exceptions {
    static void m1() throws ClassNotFoundException{
        Class.forName("Demo");
    }
    static void m2() throws ClassNotFoundException{
        Class.forName("Demo");
    }
    static void m3() throws Exception{
        m1();
        m2();
    }
    public static void main(String[] args) throws Exception {
        try{
            m3();
        }
        catch (Exception E){
            System.out.println("Handled!!");
        }
    }
}
