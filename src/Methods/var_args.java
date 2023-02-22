package Methods;

import java.util.*;
import java.lang.*;

public class var_args {

    // Basic Program to take input of integers and display;
/*
    static void show(int ... A) {
        for (int x : A) {
            System.out.println(x);
        }
    }

    public static void main(String args[])
    {

        show(1);
        show(new int[]{1,2,3,4,5,6});
    }
 */

    // Program to find maximum among numbers using var args;
    /*
    static int max(int ... A)
    {

        if(A.length==0)
            return Integer.MIN_VALUE;

        int max = A[0];
        for(int i=0;i<A.length-1;i++)
        {
            if(A[i]>max)
                max = A[i];
        }
        return max;


    }

    public static void main(String args[])
    {
        System.out.println(max());
        System.out.println(max(10));
        System.out.println(max(10,20));
        System.out.println(max(10,20,30));
    }


     */

    // Program to find sum of all elements using var args;
    /*
    static int sum(int ... A)
    {
        int sum = 0;
        for(int i=0;i<A.length;i++)
        {
            sum = sum + A[i];
        }
        return sum;
    }

    public static void main(String args[])
    {
        System.out.println(sum(1));
        System.out.println(sum(1,1));
        System.out.println(sum(1,1,1));
        System.out.println(sum(1,1,1,1));
        System.out.println(sum(1,1,1,1,1));
        System.out.println(sum(1,1,1,1,1,1));
        System.out.println(sum(1,1,1,1,1,1,1));
        System.out.println(sum(1,1,1,1,1,1,1,1));
        System.out.println(sum(1,1,1,1,1,1,1,1,1));
        System.out.println(sum(1,1,1,1,1,1,1,1,1,1));
    }
    */

    // Program to display discount;


    static double discount(double ... A)
    {
        double sum = 0;
        for(int i=0;i<A.length;i++)
        {
            sum = sum + A[i];

        }

        if(sum>500)
            sum = 0.4 * sum;
        else if(sum>300 && sum<500)
            sum = 0.1 * sum;

        return sum;

    }

    public static void main(String args[])
    {
        System.out.println("Discount : "+discount(100,200,300,400));
    }

}
