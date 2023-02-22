package Inheritance;

import org.w3c.dom.css.Rect;

import java.lang.*;
import java.util.*;

class Rectangle {

    public int length;
    public int breadth;

    public Rectangle() {
        length = breadth = 1;
    }

    public Rectangle(int l, int b) {
        length = l;
        breadth = b;
    }
}



    class cuboid extends Rectangle {
        public int height;

        public cuboid() {
            height = 1;
        }

        public cuboid(int h)
        {
            height = h;
        }
        public cuboid(int l, int b, int h)
        {
            super(l,b);
            height = h;
        }
        public int volume() {
            return length * breadth * height;
        }

    }


public class Shape {
    public static void main(String args[])
    {
       cuboid c = new cuboid(10,10,10);
       System.out.println(c.volume());

    }
}
