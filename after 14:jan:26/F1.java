import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

class F{
    public static void main(String[] args) {
        ArrayList l1 = new ArrayList<>(Arrays.asList(4,4,1,2,1,3));
        ArrayList <Integer> l2 = new ArrayList<>();

        for(int i = 0 ; i<l1.size(); i++ )
        {
            if(l2.contains(l1.get(i)))
            {
            }
            else{
                l2.add((Integer)l1.get(i));
            }
        }
        System.out.println(l2);
    }
}
class F2{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String Inp = scan.nextLine().toLowerCase();
        String [] sb = Inp.split(" ");
        TreeMap<String, Integer> tm = new TreeMap<>();
        ArrayList <Integer> al = new ArrayList<>();

        System.out.println(Arrays.toString(sb));
        
        for(int i = 0; i< sb.length ; i++)
        {
            int count = 1;
            for(int j = i+1; j<sb.length; j++)
            {
                if (tm.containsKey(sb[i])==false && sb[i].equals(sb[j]))
                {
                    count++;
                }
            }
            if (count > 1)
            {
                tm.put(sb[i], count);
                al.add(count);
            }
        }
        System.out.println(tm);
        System.out.println(al);
        for (int i =al.size()-1; i>-1; i--)
        {
            if(i-1>-1)
            {
                if (al.get(i)==al.get(i-1))
                {
                    tm.remove(tm.lastKey());
                }
                else
                    break;
            }
        }
        System.out.println(tm.lastKey());
        
    }
}