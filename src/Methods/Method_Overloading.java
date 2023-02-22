package Methods;

import java.lang.*;

public class Method_Overloading {


    //Program to display max number using method overloading;
    /*
static int max(int x , int y)
{

    return x>y?x:y;

}

static float max(float x, float y)
{

    return x>y?x:y;

}

static int max(int x, int y, int z)
{
    return x>y&&x>z?x:(y>z?y:z);

}

public static void main(String args[])
{
    System.out.println(max(8,9));
    System.out.println(max(8.6f,9.3f));
    System.out.println(max(8,9,10));


}
     */

// Program to calculate area of different shapes using method overloading;
    /*
    static int area(int l, int b)
    {
        return l*b;
    }

    static float area(float r)
    {
        return 3.14f*r*r ;
    }


    public static void main(String args[])
    {
        System.out.println(area(1));
        System.out.println(area(5,4));

    }


     */


    // Program to reverse an integer or an array using method;

    /*
    static int reverse(int n)
    {
        int r,rev=0;

        while(n>0)
        {
            r = n % 10;
            rev = rev*10 + r;
            n = n / 10;
        }
        return rev;


    }

    static void reverse(int A[])
    {

        for(int i=A.length-1;i>=0;i--)
        {

            System.out.print(A[i]+",");

        }

    }

    public static void main(String args[])
    {
        int A[]= {1,2,3,4,5};
        reverse(A);
        System.out.println(reverse(123));

    }


     */

// Program to validate name(should be in proper rules) and age(not greater than 21 and less than 16;
static boolean validate(String name)
{
    if(name.matches("[a-z A-Z]*"))
        return true;
    return false;

}

static boolean validate(int age)
{
    if(age>=16 && age <=21)
        return true;
    return false;
}

public static void main(String args[])
{
    System.out.println(validate("Sanket"));
    System.out.println(validate(20));


}


}
