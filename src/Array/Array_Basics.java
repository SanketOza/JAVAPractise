package Array;

import java.util.*;
import java.lang.*;

public class Array_Basics {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Enter Size of Array : ");
        size= sc.nextInt();

        int Arr[] = new int[size];

        System.out.println("Enter Elements in array : ");
        for(int i = 0 ;i<size; i++)
        {
            Arr[i]=sc.nextInt();
        }

        System.out.println("Elements in array are : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(Arr[i]+",");
        }

        /*
        System.out.println("\nEnter Element you want to search : ");
        int  element;
        element = sc.nextInt();
        for(int i=0;i<size;i++)
        {
            if(Arr[i]==element)
            {
                System.out.println("Element found at location : "+i);
            }
        }


        int sum = 0 ;
        for(int i=0;i<size;i++)
        {
            sum = sum + Arr[i];
        }
        System.out.println("Sum of array is : "+sum);

        int max = 0;
        int max2 = 0;
        for(int i =0 ;i<size;i++)
        {
            if(Arr[i]>max)
            {
                max2 = max;
                max = Arr[i];

            }
        }
        System.out.println("Largest element in array is : "+max);
        System.out.println("Second Largest element in array is : "+max2);


        System.out.println("Reverse of array is : ");

        for(int i=size-1;i>=0;i--)
        {
            System.out.print(Arr[i]+",");

        }

         */

    }

}
