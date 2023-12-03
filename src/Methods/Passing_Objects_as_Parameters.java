package Methods;

import java.util.*;
import java.lang.*;



public class Passing_Objects_as_Parameters {


//This program shows that if the value of formal parameter gets changed then it is not changes in actual paramter;
// that is actual parameter remains the same;
/*
static void para (int x)
{
    x++;
    System.out.println(x);

}
public static void main(String args[])
{
    int a = 10;
    para(a);
    System.out.println(a);

}
*/

    //Program for passing array as a parameter;
/*
    static void update(int A[])
    {
        A[0]=25;


    }

    public static void main(String args[])
    {
        int A[] = {1,2,3,4,5};
        update(A);
        System.out.println(A[0]);

    }
*/
    // Program to change value at specific location in array using method;


    /*

    static void change(int A[],int index, int value)
    {

        A[index] = value;

    }


    public static void main(String args[])
    {

        int A[] = {1,2,3,4,5};
        change(A,1,20);

        for(int x:A)
        {
            System.out.print(x);
        }


    }

     */





}
