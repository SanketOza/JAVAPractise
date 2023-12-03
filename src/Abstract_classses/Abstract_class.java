package Abstract_classses;


abstract class super2{

    public super2()
    {
        System.out.println("Super constructor");
    }
    public void meth1()
    {
        System.out.println("Meth1 of super");
    }
    abstract public void meth2(); // Abstract method

}

class sub2 extends super2{

    //Abstract class mainly used in Inheritance;
    //if you don't want to make child(sub) class as abstract, then just override method;
    // which is abstract in super class;

    @Override
    public void meth2()
    {
        System.out.println("Sub meth2"); // we have overrided abstract method of super class so that
        //we do not make child class as abstract;
    }

}


public class Abstract_class {

    public static void main(String args[])
    {
        //super2 s2 = new super2(); we are not able to create object of super class as it is made abstract;
        super2 s2 ; // we can only create reference of super class

        sub2 sb2 = new sub2();
        sb2.meth1();
        sb2.meth2();

        super2 s3 = new sub2(); // dynamic method dispatch is possible for abstract super class;
        s3.meth1();
        s3.meth2();


    }

}
