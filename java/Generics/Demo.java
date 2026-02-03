import java.util.ArrayList;

class Demo {
    public static void main(String[] args) {
        ArrayList ar = new ArrayList<>();
        ar.add("Shiv");
        ar.add("Shiv2");
        ar.add("Shiv3");
        ar.add(11);

        String data = (String)ar.get(1);
        System.out.println(data);

        int data3 = (int)ar.get(3);
        System.out.println(data3);
        
        String data2 = (String) ar.get(3);
        System.out.println(data2);
    }
}
