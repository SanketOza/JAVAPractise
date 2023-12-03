package Interface;

class Phone {

    public void call()
    {
        System.out.println("Phone call");
    }
    public void sms()
    {
        System.out.println("Phone sending sms");
    }

}

interface icamera{

    void click();
    void record();
}

interface imusicplayer
{
    void play();
    void stop();

}

class smartphone extends Phone implements icamera,imusicplayer
{
    public void videocall()
    {
        System.out.println("Smartphone starts video calling");
    }
    @Override
    public void click()
    {
        System.out.println("Smartphone starts clicking photos");
    }

    @Override
    public void record()
    {
        System.out.println("Smartphone starts recording video");
    }

    @Override
    public void play()
    {
        System.out.println("Smartphone starts playing music");
    }

    @Override
    public void stop()
    {
        System.out.println("Smartphone stops playing music");
    }
}

public class mobile{

    public static void main(String args[])
    {
        smartphone sp = new smartphone();
        sp.call();
        sp.click();
        sp.play();
System.out.println("\n");
        icamera ip =new smartphone();
        ip.click();
        ip.record();
System.out.println("\n");
        imusicplayer imp = new smartphone();
        imp.play();
        imp.stop();
System.out.println("\n");
        Phone p = new smartphone();
        p.call();
        p.sms();

    }


}