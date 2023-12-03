package Loops;

import java.lang.*;
import java.util.*;

        public class Display_GP_Series {

                public static void main(String args[])
                {

                        Scanner sc = new Scanner(System.in);
                        int a;
                        int d;
                        int r;
                        System.out.println("Enter number of terms you want : ");

                        a = sc.nextInt();

                        r = sc.nextInt();
                        int num = sc.nextInt();

                        int terms=a;

                        for(int i=0;i<num;i++)
                        {
                                System.out.printf(terms+",");
                                terms = terms*r;


                        }





                }

}