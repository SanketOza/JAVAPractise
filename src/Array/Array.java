import java.lang.*;
import java.util.*;


public class Array {

    public static void main(String args[]) {


        Scanner sc = new Scanner(System.in);

        int sum = 0;
        boolean flag = false;
        int A[] = new int[5];
        int Arr[] = {1, 2, 323, 4444, 35,};
        int len = Arr.length;
        System.out.println(len);

        for (int i = 0; i < Arr.length; i++) {
            sum = sum + Arr[i];
        }

        System.out.println("Sum : " + sum);

        int element;
        System.out.println("Enter Element you want to search : ");

        element = sc.nextInt();

        for (int i = 0; i < Arr.length; i++) {
            if (Arr[i] == element) {
                System.out.println("Element found at : " + i);
                flag = true;
                break;
            }
        }

        if(flag == false)
        {
            System.out.println("Element not found");
        }


        int max = Arr[0];

      /*  for(int i=0;i<Arr.length;i++)
        {
            if(Arr[i]>max)
            {
                max = Arr[i];
            }
        }

        System.out.println("Max element : "+max);
*/

/*
        int max2 = Arr[0];
        for(int i=0;i<Arr.length;i++)
        {

            if(Arr[i]>max)
            {
                max2 = max;
                max = Arr[i];
            }

        }
System.out.println("2nd max : "+max2);
 */



    }
}