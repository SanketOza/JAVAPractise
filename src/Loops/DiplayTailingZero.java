package Loops;

import java.lang.*;
import java.util.*;


// Program :- To display numbers even with tailing zero; e.g:- 1700 o/p:- 0071


public class DiplayTailingZero {

public static void main(String args[])
{

    Scanner sc = new Scanner(System.in);

    int num,r;
    num = sc.nextInt();

    String str = "";

    while(num>0)
    {
        r = num%10;
        num = num/10;
        str = str + r;

    }
System.out.println(str);

    char c;

    for(int  i = str.length()-1;i>=0;i--)
    {
        c = str.charAt(i);
        switch(c)
        {
            case '0':System.out.print("Zero");
            break;

            case '1':System.out.print("one ");
            break;

            case '2':System.out.print("two ");
            break;

            case '3':System.out.print("three");
                break;

            case '4':System.out.print("four");
                break;

            case '5':System.out.print("five");
                break;

            case '6':System.out.print("six");
                break;

            case '7':System.out.print("seven");
                break;

            case '8':System.out.print("eight");
                break;

            case '9':System.out.print("nine");
                break;
                default:
                    System.out.print(" Invalid");


        }



    }





}


}
