import java.lang.*;
import java.util.*;


/*
public class Practise {

    public static void main(String args[]) {
        System.out.println("Hello Java!!");

    }


}
*/


/*
public class Practise{

    public static void main (String args[])
    {12
        Scanner s = new Scanner(System.in);

        int a,b,add ;
        System.out.println("Enter two numbers");
        a = s.nextInt();
        b = s.nextInt();
        add = a + b;
        System.out.println("Addition : " + add);

    }

}
*/

/*

public class Practise {


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);
        double area;
        float r;
        String name;
        int choice;


        for (int i = 0; i <= 1; i++) {
            System.out.println("--------------Select choice---------------");
            System.out.println("1.Area\n2.Name");
            choice = s.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter Radius");
                    r = s.nextFloat();
                    area = (3.14) * r * r;
                    System.out.println("Area:\t " + area);
                    break;

                case 2:
                    System.out.println("Enter name ");
                    name = s.nextLine();
                    System.out.println("Your name:\t"+name);
                    break;

                default:
                    System.out.println("Invalid choice");


            }

        }

    }
}
*/


//

public class Practise {
    public static void main(String args[])
    {
        char ch = 127;
        ch++;

        char a = (char) ch;

        System.out.println(a);
    }
}




