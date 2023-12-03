package Inner_classes;

class local_outer
{
    void local_outer_display()
    {
        class local_inner
        {
            void local_inner_display()
            {
                System.out.println("Hello");
            }
        }
        local_inner li = new local_inner();
        li.local_inner_display();

    }

}
public class Local_inner_classes
{
    public static void main(String args[])
    {
        local_outer lo = new local_outer();
        lo.local_outer_display();
    }
}
