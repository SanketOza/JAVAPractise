package Method_Overrriding;


class television{
    public void switchOn()
    {
        System.out.println("Television is ON");
    }
    public void changeChannel()
    {
        System.out.println("Television channel is changed");
    }
}

class SmartTV extends television
{

    public void switchOn()
    {
        System.out.println("Smart TV is ON");
    }

    public void changeChannel()
    {
        System.out.println("Smart TV channel is changed");
    }

    public void browse()
    {
        System.out.println("Smart TV browsing is done");
    }

}

public class TV
{
    public static void main(String args[])
    {
        television t = new television();
        t.switchOn();
        t.changeChannel();

        SmartTV st = new SmartTV(); //Method Overriding is done;
        st.switchOn();
        st.changeChannel();

        television tv = new SmartTV(); // Dynamic Method dispatch can be seen
        tv.switchOn();
        tv.changeChannel();

    }

}
