package Strings;
import java.util.Scanner;
import java.lang.String;
import java.lang.*;
import java.util.*;


public class Practise {


// P1 :- Given string str ="programmer@gmail.com";
//       your task is to separate username and domain and thereafter print it;
    /*
    public static void main(String args[])
    {

        String str = "programmer@gmail.com";
        String sub = str.substring(0,10);
        System.out.println("Username: "+sub);
        String sub1 = str.substring(11,20);
        System.out.println("Domain name: "+sub1);
    }
*/

// P2 :- Program to
// 1) find if a number is binary or not;
// 2) find if a number is hexa-decimal or not;
// 3) find if the data is in Date format (dd/mm/yy);

    /*
    public static void main(String args[])
    {

        int b = 10110001;
        //first we will convert integer into string;

        String str = b + ""; // this will convert integer into string;;
        //or
        String str1 = String.valueOf(b); // this will also convert integer into string;

        System.out.println(str);

        System.out.println(str.matches("[01]*"));
        System.out.println(str1.matches("[01]*"));
    }
*/

    /*
    public static void main(String arg[])
    {
        String str = "AF23441";
        System.out.println(str.matches("[A-F 0-9]+"));
    }
*/

    /*

    public static void main(String args[])
    {
        String str = "21/01/2023";
        System.out.println(str.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

    }

*/

//P3 :- Program to
//1) Remove special characters from a string;
//2) Remove extra spaces from a string;
//3) Find number of words in a string;


    /*
    public static void main(String args[])
    {
        String str ="S@an%ket";


        //Now to remove special character from the string we will first replace the special characters with empty
        // spaces; for this we will use String.replaceALl("regular_expression," ") method;

        String space = str.replaceAll("[^a-z 0-9 A-Z]", "");
        System.out.println(space);

*/

    /*
    public static void main(String args[])
    {

        String str = "  Hey  Buddy        Do       u     know             Java";
        //Now here we want to remove extra space so we can again use
        // String.replaceAll(" ","") method;

        String extra = str.replaceAll("\\s+"," ");// This method cannot remove trailing/beginning spaces;

        //Therefore to remove trailing spaces we use "trim" method using dot(.) operator;

        String extra1 = str.replaceAll("\\s+"," ").trim();

        System.out.println(extra1);

    }
*/

    public static void main(String args[])
    {
        String str = "Hey Buddy Do u Know java";
        //Now here we want to find words so for that we try to split the string using spaces.
        //We use str.split("Regular expression") for the same which will generate array of words;
        //That is we use array to store those splitted words;

        String words[] = str.split("\\s");
        System.out.println(words.length); //This statement gives number of words.

    }
}
