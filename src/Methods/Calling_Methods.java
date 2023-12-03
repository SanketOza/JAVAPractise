package Methods;

import java.util.*;
import java.lang.*;


//There are two methods of calling methods:-
//1. By putting static keyword
// OR
//2. By creating object of that class;


public class Calling_Methods {

    //Program for calculating max among two numbers using method;

    /*
    static int max(int x,int y)
{
    if(x>y)
        return x;
    else
        return y;

}

public static void main(String args[])
{

    int a=10,b=20;
    int c = max(a,b);
    System.out.println(c);

}

*/


// Program for calculating max among two numbers by using method and creating object of that class;
//Note:- Here we dont need to put static keyword in function when we create object of that class and pass it as parameter;

    /*
    int max(int x, int y)
    {
        if (x>y)
        {
            return x;
        }
        else
        {
            return y;
        }

    }

    public static void main(String args[])
    {
        int a=10,b=20;
        Methods_Basics mb = new Methods_Basics();
        int c = mb.max(a,b);
        System.out.println(c);
    }


     */

}






