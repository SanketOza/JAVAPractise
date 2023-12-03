package Inheritance;

import java.util.*;
import java.lang.*;
class parent
{
    public parent()
    {
        System.out.println("Parent Constructor");
    }

}

class child extends parent{

    public child()
    {
        System.out.println("Child constructor");
    }


}

class grandchild extends child{

    public grandchild()
    {
        System.out.println("Grandchild constructor");
    }
}

public class Non_Parameterized_Constructors {

    public static void main(String args[]) {
        parent p = new grandchild();
    }

}
