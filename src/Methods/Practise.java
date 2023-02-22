package Methods;

import java.util.*;
import java.lang.*;
public class Practise {


    //Program to find whether the number is a prime number or not;

    /*
    static int count =0;
    static void prime(int n)
    {

        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
                count++;
        }

        if(count==2)
        {
       System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }

    }

    public static void main(String args[])
    {
        int num =17;

        prime(num);

    }


     */

    // Program to find gcd of two numbers using method;

    /*
    static int GCD(int m , int n)
    {
        while(m!=n)
        {

            if(m>n)
                m = m - n;
            else if(n>m)
            {
                n = n - m;
            }

        }
return m;


    }

    public static void main(String args[])
    {
        int m = 30, n = 21;

        System.out.println("GCD : "+GCD(m,n));

    }


     */

    // Program to calculate max of array using method;

    /*
    static int max(int A[])
    {
        int max = 0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
                max = A[i];
        }
        return max;
    }

    public static void main(String args[])
    {
        int A[] = { 1,2,3,4,5};

        System.out.println("Max : "+max(A));

    }


     */



}
