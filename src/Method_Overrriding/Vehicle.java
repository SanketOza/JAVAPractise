package Method_Overrriding;

import java.util.*;
import java.lang.*;

class classic_cars
{
    public void start()
    {
        System.out.println("classic car starts");
    }
    public void accelerate()
    {
        System.out.println("classic car accelerates");
    }
    public void Gear()
    {
        System.out.println("manual gear");
    }

}

class luxury_car extends classic_cars
{
    public void start()
    {
        System.out.println("Luxury car starts");
    }

    public void accelerate()
    {
        System.out.println("luxury car accelerates");
    }
    public void Gear()
    {
        System.out.println("Automatic gear");
    }
    public void rooftop()
    {
        System.out.println("Rooftop opens in luxury car");
    }

}


public class Vehicle {

    public static void main(String args[])
    {
        classic_cars c = new classic_cars();
        c.start();
        c.accelerate();
        c.Gear();

        System.out.println("\n");

        luxury_car l = new luxury_car(); // method overriding can be seen
        l.start();
        l.accelerate();
        l.Gear();
        l.rooftop();

        System.out.println("\n");

        classic_cars c1 = new luxury_car(); // Dynamic method dispatch can be seen here;
        c1.start();
        c1.accelerate();
        c1.Gear();



    }




}
