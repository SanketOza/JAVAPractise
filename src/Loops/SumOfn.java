package Loops;

import java.lang.*;
import java.util.*;
public class SumOfn {

public static void main(String args[])
{

    Scanner sc = new Scanner(System.in);
    int num;
    System.out.println("Enter Number : ");
    num = sc.nextInt();

    int sum = 0;

    for(int i=0;i<=num;i++)
    {
     sum = sum + i;
    }
System.out.println("Sum : "+sum);
}

}
