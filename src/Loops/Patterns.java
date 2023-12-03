package Loops;

import java.lang.*;
import java .util.*;

public class Patterns {

    /*
    public static void main(String args[])
    {

        for(int i=1;i<=5;i++)
        {

            for(int j = 1;j<=5;j++)
            {
                System.out.print("["+j+"]" );

            }
            System.out.print("\n");
        }

*/


    /*
    public static void main(String args[])
    {

        int sum=0;
        for(int i=1;i<=5;i++)
        {

            for(int j = 1;j<=5;j++)
            {
                sum = sum+1;

                System.out.print("["+sum+"]");
            }
            System.out.print("\n");
        }


*/

    /*
    public static void main(String args[])
    {

        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=5;j++)
            {
                if(i<j)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(j);
                }
                }
            System.out.print("\n");


        }

*/

    /*
    public static void main(String args[]) {


        int sum = 0;


        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5; j++) {
                if (j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    sum = sum + 1;
                    System.out.print("["+sum+"]");
                }

            }

            System.out.println("\n");
        }
    }
     */

    /*
    public static void main(String args[])
    {

        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i+j)<=6)
                {
                    System.out.print(j);
                }
                else
                {
                    System.out.print(" ");
                }

            }
System.out.print("\n");

        }




*/

    /*
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if(i<j)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");


        }


    }
*/

/*
    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i+j)<=6)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }

            }
            System.out.print("\n");


        }


    }
*/

    /*

    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i+j)>6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }

            for(int k=1;k<=5;k++)
            {
                if(k>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }


            }


            System.out.print("\n");



        }
*/


    public static void main(String args[])
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=5;j++)
            {
                if((i+j)>6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }

            for(int k=1;k<=5;k++)
            {
                if(k>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }


            }

            System.out.print("\n");

        }


        for(int i=1;i<=5;i++)
        {

            for(int j=1;j<=5;j++)
            {
                if(j>i)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }

            for(int k=1;k<=5;k++)
            {

                if((i+k)<6)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }

            }
            System.out.print("\n");

        }






    }







}
