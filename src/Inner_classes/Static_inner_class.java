package Inner_classes;


class static_outer
{
    static int x = 20;
    int y = 20;

    static class static_Inner
    {
        void static_inner_display()
        {
        System.out.println("x : "+x);
        //System.out.println("y : "+y); // error will occur because static class can only access static members;

        }

    }

}


public class Static_inner_class
{

    public static void main(String args[])
    {

        static_outer.static_Inner so = new static_outer.static_Inner();
        so.static_inner_display();
    }
}
