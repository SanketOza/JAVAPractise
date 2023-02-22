package Strings;

import java.lang.*;
import java.util.Scanner;
import java.lang.String;

public class pool_heap_string {


    /*
    public static void main(String args[])
    {

        String str1 = "Hello Java"; //Without new String created in pool
        String str2 = new String("How's it going Java"); // With new String created in heap
        System.out.println(str1);
        System.out.println(str2);


    }
*/

    /*
    public static void main(String args[])
    {
        char c[]={'h','e','l','l','o'};
        byte b[]={65,66,67,68};

        String str3 = new String(c);
        String str4 = new String(b);
        String str5 = new String(c,0,2); // Start from 0 print 2 letters
        String str6 = new String(b,0,2); // Start from 0 print 2 letters


        System.out.println(str3);
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str6);


    }



     */


//Comparing two strings,we basically use reference for comparisons.

    public static void main(String args[])
    {
        String str1 = "JAVA";
        String str2 = "JAVA";
        System.out.println(str1==str2); // Comparing two strings using there reference.
        // output : true



        String str3 = "JAVA";
        String str4 = "java";
        System.out.println(str3==str4); // output : false




        String str5 = "JAVA";
        String str6 = new String("JAVA");
        System.out.println(str5==str6); // output: false because we are comparing string in pool vs string in heap.



    }





}
