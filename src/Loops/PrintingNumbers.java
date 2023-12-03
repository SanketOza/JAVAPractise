package Loops;
import java.util.*;
import java.lang.*;

public class PrintingNumbers {



    //Program to print number from 1 to 10
/*
    public static void main(String args[])
    {
        for(int i=1;i<=10;i++)
        {
            System.out.println(i);
        }

    }
*/

    //Program to print multiplication table;

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.println("Enter the number : ");
        num = sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num+"*"+i+"="+num*i);
        }




    }




}
