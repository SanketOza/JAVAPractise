package Data_Hiding;

import java.util.*;
import java.lang.*;

class Circle{

    private double radius;

    public double getRadius()
    {
        return radius;
    }

    public void setRadius(int r) {
        radius = r;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

}
class Rectangle{

    private double length;
    private double breadth;

    public double getLength()
    {
        return length;
    }
    public void setLength(double l)
    {
        if(l>0)
            length = l;
        else
            length = 0;
    }

    public double getBreadth()
    {
        return breadth;
    }
    public void setBreadth(double b)
    {
        if(b>0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        if(length==breadth)
            return true;
        else
            return false;
    }

}

class cylinder{

    private double radius;
    private double height;


    public double getRadius()
    {
        return radius;
    }
    public void setRadius(int r)
    {
        radius = r;
    }

    public double getHeight()
    {
        return height;
    }
    public void setHeight(int h)
    {
        height = h;
    }

    public double lidarea()
    {
        return Math.PI*radius*radius;
    }

    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    public double Total_Surface_Area()
    {
        return 2*lidarea()+circumference()*height;
    }
    public double volume()
    {
        return lidarea()*height;
    }

}

public class Shape {

    public static void main(String args[])
    {

        /*
        Circle c = new Circle();
        c.setRadius(1);
        System.out.println(c.area());
        System.out.println(c.perimeter());
*/

/*
       Rectangle r = new Rectangle();

        r.setLength(10.5);
        r.setBreadth(5.5);

        System.out.println("Length : "+r.getLength());
        System.out.println("Breadth : "+r.getBreadth());
        System.out.println("isSquare :"+r.isSquare());

        System.out.println("Area"+r.area());
        System.out.println("Breadth"+r.perimeter());

 */

        /*
        cylinder c = new cylinder();

        c.setRadius(7);
        c.setHeight(10);

        System.out.println("Radius : "+c.getRadius());
        System.out.println("Height : "+c.getHeight());
        System.out.println("Lid Area : "+c.lidarea());
        System.out.println("Total Surface Area : "+c.Total_Surface_Area());
        System.out.println("Volume : "+c.volume());


         */



    }

}
