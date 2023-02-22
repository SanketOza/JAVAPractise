package Loops;

import java.lang.*;
import java.util.*;
public class ReverseNumber {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int num,m,r,rev=0;
        num = sc.nextInt();
        m = num;

        while(num>0)
        {
            r = num%10;
            rev = rev*10 + r;
            num=num/10;

        }

System.out.println(rev);
if(m==rev)
{
    System.out.println("Palindrome");
}
else
{
    System.out.println("Not Palindrome" );
}

    }





}
