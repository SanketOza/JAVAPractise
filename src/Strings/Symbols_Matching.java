package Strings;

import java.lang.*;
import java.util.Scanner;
import java.lang.String;

//This method is used to match only single characters in the string.
public class Symbols_Matching {
    public static void main(String args[]) {

        //use of '.' symbol :- It is to match any single character with string containing single character;
        String str1 = "a";
        System.out.println(str1.matches("a")); // output :- true;


        String  str2 = "abcd";
        System.out.println(str2.matches("a")); // output:- false;

        //use of [abc] symbol :- It is used to match either s or a from below sop string;

        String str3 = "a";
        System.out.println(str3.matches("[sa]"));

        String str4 ="a";
        System.out.println(str4.matches("[sd]"));

        //use of [abc][vz] : It is used to match either first set [abc] or second set [vz];

        String str5 = "a9";
        System.out.println(str5.matches("[ab][19]"));

        String str6 = "1q";
        System.out.println(str6.matches("[ab][19]"));

        // use of [^abc] :- It is used to match except abc or string whom you have attached [^];

        String str7 = "s";
        System.out.println(str7.matches("[^zwe]"));

        String str8 = "a";
        System.out.println(str8.matches("[^abcd]"));

        // Use of A|B :- It is used to match Either A or B;

        String str9 = "a";
        System.out.println(str9.matches("a|b"));

        String str10 = "z";
        System.out.println(str10.matches("a|b"));

        // Use of xz :- It is used to match exactly xz with string;

        String str11 = "xz";
        System.out.println(str11.matches("xz"));

        String str12 = "xz";
        System.out.println(str9.matches("ab"));












    }
}
