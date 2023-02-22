package Method_Overrriding;

import java.util.*;
import java.lang.*;

class super1
{
    public void display() // This method is shadowed during method overriding;
    {
        System.out.println("Hello Super");
    }
}

class subclass extends super1
{
    public void display()
    {
        System.out.println("Hello child");
    }


}
public class super_sub
{
    public static void main(String args[])
    {
        subclass sub = new subclass(); // Here we can see dynamic method dispatch as both super and subclass have same;
        sub.display();                 // but method of superclass is overrided by method of subclass and called;

        super1 sup1 = new subclass(); // This is dynamic method dispatch;
        sup1.display();

    }

}
