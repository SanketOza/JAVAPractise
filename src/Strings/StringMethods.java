package Strings;

import java.lang.*;
import java.util.Scanner;
import java.util.*;
import java.lang.String;


public class StringMethods {

    public static void main(String args[])
    {
        String str = "JAVA";


//1.Length of the String;

int l = str.length();
System.out.println("Length:"+l);

//2.Change to Lowercase;
String strlower = str.toLowerCase();
System.out.println(strlower);

//3.Change to Uppercase
String strupper = str.toUpperCase();
System.out.println(strupper);

//4. trim method is used to remove blank spaces;

String str1 = "  WELCOME  ";
String trim = str1.trim();
System.out.println(trim);

//5. substring basically used to return part of a string;

        String str2 = "WELCOME";
        String substring = str2.substring(4);
        System.out.println(substring);

//6. substring with beginning and ending mentioned;

        String sub = str2.substring(1,4);
        System.out.println(sub);

        //7. Replacing character in string;

        String rep = str2.replace('O','A');
        System.out.println(rep);


        //8. boolean startsWith(String S) this method can be used to check whether the string starts from the character you want;

        String str3 = "www.google.com";
        System.out.println(str3.startsWith("www"));

        //9. boolean endsWith(String S) this method can be used to check whether the string end the way character you want;

        String str4 = "www.fb.com";
        System.out.println(str4.endsWith("com"));

        //10.char charAt(int index) use this method when you want to print character at certain index;

        System.out.println(str4.charAt(4));

        //11. int indexOf(String S) use this method when you want to search character and display its index in string;
        System.out.println(str4.indexOf("."));
        System.out.println(str4.indexOf(".",4));
        //here '.' is the character you want to search and '4' is the starting point from where you want to search;
        //this method will display first index location where character will be the found;

        System.out.println(str4.indexOf("?"));
        //Since we don't have any character as '?' in our string, so it returns '-1' viz invalid index;


        //12. int lastIndexOf(String S) use this method to search character from last and display its index;
        System.out.println(str4.lastIndexOf(".",5));
        //Here we want to search '.' and our starting point is at index 5 so from there first location where character;
        //will be found in the string its index will be displayed;
        //Note:- index for that searched element will be starting from starting point you mentioned to search;

        //13. boolean equals this will check whether the two strings have "exactly same" contents or not;
        //Note:- with exactly same means "spaces" are also considered;
        //if string matches it will return true else it will return false;

        System.out.println(str4.equals("www.fb.com"));
        System.out.println(str4.equals("hello"));

        //14. boolean equalsIgnoreCase(String s) this method will ignore the cases and check whether the string is same or not;

        System.out.println(str4.equalsIgnoreCase("WWW.FB.COM"));

        //15. int compareTo(String s) this method is used to compare two strings in dictionary order;
        // we basically check which string 1 when compared with string 2;
        // if string 1 comes later than string 2 ex. B comes after A then output is +1;
        // else it returns -1;

        String str5 = "B";
        String str6 = "A";

        System.out.println(str5.compareTo(str6));
        // OUTPUT:- +1 because B comes after A therefore it is true;

        System.out.println(str6.compareTo(str5));
        // OUTPUT:- invalid index since A doesnt come after B;

        //Note:- This method just goes on comparing in descending order which is A to Z and not A to Z comparison;


        //16. Comparison when we check pool with heap;
        String str7 = "java";
        String str8 = new String("java");

        System.out.println(str7.equals(str8));





    }
}
