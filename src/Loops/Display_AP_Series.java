package Loops;

import java.lang.*;
import java.util.*;
public class Display_AP_Series{


    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter number of AP terms you want : ");
        n = sc.nextInt();
        int a = sc.nextInt();
        int d = sc.nextInt();
        int terms = a ;


        for(int i=0;i<=n;i++)
        {
            System.out.printf(terms+",");
            terms = terms + d;

        }

    }


}


