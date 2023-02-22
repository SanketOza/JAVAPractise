package Loops;

import java.lang.*;
import java.util.*;
public class Fibonacci_Series {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();

        int a = 0 , b = 1;

        System.out.printf((a+","+b+","));

        for(int i=0;i<n-2;i++)
        {
            int c = a + b;
            System.out.printf(c+",");
            a=b;
            b=c;


        }

    }





}
