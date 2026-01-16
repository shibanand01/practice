import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

class C1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Input = scan.nextLine();
        Input = Input.toLowerCase();

        boolean mark = false;

        TreeSet <Character> t1 = new TreeSet<>();

        for(int i = 0; i< Input.length(); i++)
        {
            t1.add(Input.charAt(i));
        }
        System.out.println(t1);

        TreeSet <Character> t2 = new TreeSet<>();
        for(char c = 'a'; c<='z';c++)
        {
            t2.add(c);
        }
        System.out.println(t2);

        System.out.println(t1.containsAll(t2));
    }
}

class C2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Inp = scan.nextLine();
        Inp = Inp.toLowerCase();
        StringBuilder sb = new StringBuilder();

        for (char c = 'a'; c<='z';c++)
        {
            int count =0;
            for(int i =0; i < Inp.length(); i++)
            {
                if (c == Inp.charAt(i))
                {
                    count++;
                }
            }
            if (count>0)
            {
                sb.append(c);
                sb.append(count);
            }
        }
        System.out.println(sb);
        scan.close();
    }
}