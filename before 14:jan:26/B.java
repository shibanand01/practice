import java.util.Arrays;
import java.util.Scanner;

class B1 {
    public static void main(String[] args) {
        int [] arr = {2,2,3,1};

        for(int i = 0; i <arr.length; i++)
        {
            for (int j = i+1; j < arr.length; j++)
            {
                if(arr[i]> arr[j])
                {
                    int temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp;
                }
            }
        }
        int uniq = 0;
        for (int i = arr.length-1; i>-1; i--)
        {
            if (arr[i]!= arr[i-1])
            {
                uniq = arr[i-1];
                break;
            }
            else {
                uniq = -1;
            }
        }
        System.out.println(uniq);
    }
}
class B2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();

        int [] arr2 = new int[arr.length];
        
        for (int i = 0; i<k; i++)
        {
            arr2[i]=arr[arr.length-k+i];
        }
        for(int i = k; i<arr2.length; i++)
        {
            arr2[i]=arr[i-k];
        }
        System.out.println(Arrays.toString(arr2));

    }
}