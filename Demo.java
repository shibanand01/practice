import java.util.Arrays;
import java.util.Scanner;

// reverse an string
public class Demo {

    public static String reverse(String text){

        String [] reverse_arr = text.split(" ");
        String reverse ="";

        for (int i = 0; i < reverse_arr.length ; i++)
        {
            boolean mark = false;
            char c = reverse_arr[i].charAt(reverse_arr[i].length()-1);
            if((c<'A'||c>'Z') && (c<'a' || c>'z') && (c<'0'||c>'9') && (c!='\''))
            {
                mark = true;
            }
            if(mark == true)
            {
                reverse_arr[i] = c + reverse_arr[i].substring(0,reverse_arr[i].length()-1);
            }
        }

        for(int i = reverse_arr.length-1; i >= 0 ; i--)
        {
            reverse = reverse+reverse_arr[i]+" ";
        }

        return reverse;
    }
    public static void main(String[] args) {
        // Taking the statement as input
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();


        System.out.println(reverse(text));


    }
}
