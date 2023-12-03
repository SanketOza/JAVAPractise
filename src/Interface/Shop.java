package Interface;

interface Member
{
    public void callback();
}

class store
{
    Member members[] = new Member[100];
    int count = 0;

    void register(Member m)
    {
        members[count++] = m;
    }
    void inviteSale()
    {
        for(int i=0;i<count;i++)
            members[i].callback();
    }

}

class customer implements Member
{
    String name;

    customer(String name)
    {
        this.name = name;
    }
   public void callback()
    {
        System.out.println("OK!, I will visit :  "+name);
    }
}



public class Shop {


    public static void main(String args[])
    {
        store s = new store();
        customer c1 = new customer("JOHN");
        customer c2 = new customer("SMITH");
        s.register(c1);
        s.register(c2);
        s.inviteSale();
    }
}
