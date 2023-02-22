package Inheritance;

import java.lang.*;
import java.util.*;

class Rectangle1
{
    int length;
    int breadth;

    public Rectangle1(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle1()
    {
        length = breadth = 1;
    }

    public int area()
    {
        return length*breadth;
    }

}

public class this_keyword
{
 public static void main(String args[])
 {
     Rectangle1 rec = new Rectangle1(10,20);
     System.out.println(rec.breadth);

 }

}
