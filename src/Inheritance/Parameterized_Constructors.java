package Inheritance;

import java.util.*;
import java.lang.*;

class par_ent
{
    public par_ent()
    {
        System.out.println("Non Parameterized Constructor parent");
    }
    public par_ent(int x)
    {
        System.out.println("Parameterized Constructor parent : "+x);
    }
}

class chi_ld extends par_ent
{
    public chi_ld()
    {
        System.out.println("Non Parameterized Constructor child");

    }

    public chi_ld(int y)
    {
        System.out.println("Parameterized Constructor child : "+y);
    }

    public chi_ld(int x,int y)
    {
        super(x); // This will call superclass constructor
                  // super is a keyword which refers to super class that is parent class;
                  // Here we are using super keyword to call parameterized constructor of parent/super class;
        System.out.println("2 parameters of child");
    }
}

public class Parameterized_Constructors
{
    public static void main(String args[])
    {
        chi_ld c = new chi_ld(10,6);
        par_ent p = new chi_ld(5);
    }


}
