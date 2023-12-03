package Interface;


interface test
{

void meth1();
void meth2();


}

class my implements test
{

    @Override
    public void meth1()
    {
        System.out.println("Meth1 0f my ");
    }

    @Override
    public void meth2() {
        System.out.println("Meth2 of my");
    }

    public void meth3()
    {
        System.out.println("Meth3 of my");
    }
}


public class Interface_Practise {

public static void main(String args[])
{
    //test t = new test();  we cannot create object of interface as all the methods in the interface are;
    // by default abstract;

    test t = new my(); // dynamic method dispatch;

    t.meth1();
    t.meth2();

    //t.meth3(); cannot be called because the reference is of test


}
}
