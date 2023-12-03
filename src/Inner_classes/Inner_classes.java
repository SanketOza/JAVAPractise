package Inner_classes;

import java.lang.*;
import java.util.*;

class Outer
{

    int x = 10;

    class Inner
    {
        int y = 20;

        void inner_display()
        {
            System.out.println("x : "+x);
            System.out.println("y : "+y);
        }

    }

    void outer_display()
    {
        Inner in = new Inner();
        in.inner_display();
        System.out.println("y : "+in.y);

    }

}


public class Inner_classes
{
    public static void main(String args[])
    {
        Outer.Inner oi =    new Outer().new Inner();
        oi.inner_display();

    }

}
