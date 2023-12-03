package Abstract_classses;


abstract class shape{

    public shape()
    {
        System.out.println("Standards of shape");
    }
    abstract public double perimeter();
    abstract public double area();
}

class circle extends shape
{
    private double radius;

    public circle(int radius)
    {
        this.radius = radius;
    }
    public double perimeter()
    {
        return 2*Math.PI*radius; // overrrided from shape;
    }
    public double area() // overrided from  shape;
    {
        return Math.PI*radius*radius;
    }

}


class rectangle extends shape{

    private double length;
    private double breadth;

    public rectangle(int length, int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double perimeter() {
        return 2*(length+breadth);
    }

    @Override
    public double area() {
        return length*breadth;
    }
}

public class shape1 {

    public static void main(String args[])
    {
        shape c = new circle(10);
        System.out.println(c.area());
        System.out.println(c.perimeter());

        shape r = new rectangle(10,10);
        System.out.println(r.area());
        System.out.println(r.perimeter());
    }



}
