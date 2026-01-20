import java.io.BufferedReader;
import java.io.InputStreamReader;

class Rough {
    public static void main(String[] args)throws Exception {
        System.out.println("Enter the number : ");
        // int num = System.in.read();

        // System.out.println(num-48);

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = Integer.parseInt(bf.readLine());
        System.out.println(num);
        bf.close(); 
    }
}

