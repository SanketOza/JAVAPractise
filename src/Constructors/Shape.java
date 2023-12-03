package Constructors;

import java.lang.*;
import java.util.*;
class Rectangle
{
 private int length;
 private int breadth;

 public Rectangle()
 {
     length = 1;
     breadth = 1;
 }

 public Rectangle(int l, int b)
 {
     length = l;
     breadth = b;
 }

 public int area()
 {
     return length*breadth;
 }

}












public class Shape
{

    public static void main(String args[])
    {
        /*
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(10,5);

        System.out.println(r1.area());
        System.out.println(r2.area());
         */
    }

}
