package Class;


import java.lang.*;
import java.util.*;

class Circle{
    public double radius;

    public double Area() {

        return Math.PI*radius*radius;
    }

    public double Perimeter() {

        return Math.PI*2*radius;

    }
}

class Rectangle{


    public int length;
    public int breadth;

    public int area()
    {
        return length*breadth;
    }

    public int perimeter()
    {
        return 2*(length+breadth);
    }

    public Boolean isSquare()
    {
        if(length==breadth)
            return true;
        return false;
    }
}


class Cylinder{

    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI*radius*radius;
    }

    public double circumference(){
        return 2*Math.PI*radius;
    }

    public double total_Surface_Area()
    {
        return 2*lidArea()+circumference()*height;
    }

    public double volume()
    {
        return lidArea()*height;
    }

}




public class Shape {

    public static void main(String args[])
    {

        /*
        Circle c1 = new Circle();
        Circle c2 = new Circle();

        c1.radius = 1;
        c2.radius = 2;

        System.out.println("Perimeter "+c1.Perimeter());
        System.out.println("Area : "+c1.Area());

        System.out.println("Perimeter "+c2.Perimeter());
        System.out.println("Area : "+c2.Area());

         */

        /*
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();

        r1.length = 1;
        r1.breadth = 2;

        r2.length = 1;
        r2.breadth =2;

        System.out.println("Area of r1 : "+r1.area());
        System.out.println("Perimeter of r1 : "+r1.perimeter());
        System.out.println(r2.isSquare());


        System.out.println("Area of r2 : "+r2.area());
        System.out.println("Perimeter of r2 : "+r2.perimeter());
        System.out.println(r2.isSquare());

         */

        Cylinder c = new Cylinder();
        c.height = 10;
        c.radius = 7;

        System.out.println("Lid Area : "+c.lidArea());
        System.out.println("Total Surface Area : "+c.total_Surface_Area());
        System.out.println("Volume : "+c.volume());

    }

}
