package Inner_classes;

abstract class anonymous_my
{
    abstract void anonymous_display();
}

class anonymous_outer
{
    public void anonymous_outer()
    {
        anonymous_my a_my = new anonymous_my()
        {
            @Override
            public void anonymous_display() {
             System.out.println("Hello");
            }
        };
    a_my.anonymous_display();
    }

}

public class Anonymous
{
    public static void main(String args[])
    {
        anonymous_outer ao = new anonymous_outer();
        ao.anonymous_outer();


    }

}
