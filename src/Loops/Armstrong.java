package Loops;

import java.lang.*;
import java.util.*;
public class Armstrong {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int n;
        n = sc.nextInt();
        int m = n;
        int sum=0,r;


        while(n!=0)
        {
            r = n % 10;
            sum = sum + r*r*r;
            n = n / 10;
        }

        if(m==sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong");
        }

    }



}
