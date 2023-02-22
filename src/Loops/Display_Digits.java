package Loops;

import java.lang.*;
import java.util.*;

public class Display_Digits {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int number;
        number = sc.nextInt();
        int count = 0;
        int r;
        while(number!=0)
        {
            count++;
            r = number%10;
            System.out.println(r);
            number = number / 10;
        }
System.out.println("Count : "+count);

    }
}