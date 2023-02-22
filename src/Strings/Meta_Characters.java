package Strings;
import java.lang.String;
import java.lang.*;
import java.util.Scanner;
import java.util.*;


public class Meta_Characters {


    public static void main(String args[])
    {

        // Use of \\d :- to match digits; agar digits dikhte hai toh yeh true return karega;
        // Use of \\D :- to not match digits; agar digits nahi dikhte hai toh yeh true return karega;

        String str1 ="9";
        System.out.println(str1.matches("\\d"));
        System.out.println(str1.matches("\\D"));


        // Use of \\s :- to check/match spaces; agar spaces hai toh yeh true return karegat;
        // Use of \\S :- to not check/match spaces; agar spaces nhi hai toh yeh true return karega;

        String str2 = " ";
        System.out.println(str2.matches("\\s"));
        System.out.println(str2.matches("\\S"));

        // Use of \\w :- agar alphabets yaa digits hai toh yeh true return karega;
        // Use of \\W :- agar alphabets yaa digits nahi hai toh yeh true return karega;

        String str3 ="9";
        System.out.println(str3.matches("\\w"));
        System.out.println(str3.matches("\\W"));







    }

}
