package Exception_Handling;

import java.lang.*;
import java.util.*;
import java.io.*;


class LowBalanceException extends Exception
{
    public String toString()
    {
        return "Balance Should not be less than 5000";
    }
}

public class Exception_1 {

    //getMessage() method
    /*
    static void fun1()
    {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }

    }


     */

    //Using printStackTrace();
    /*
    static void fun2()
    {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }


     */


/*
        static void fun1()
        {
            try
            {
                throw new LowBalanceException();
            }
            catch(LowBalanceException e)
            {
                System.out.println(e);
            }
        }

        static void fun2()
        {
            fun1();
        }

        static void fun3()
        {
            fun2();
        }



 */
    /*
        public static void main(String[] args)
        {
            fun3();
        }*/
    }




