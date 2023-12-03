import java.lang.*;
import java.util.*;


// Area of triangle
/*
public class area {


    public static void main(String args[])
    {




        Scanner s = new Scanner(System.in);

        float base,height;
        float area;

        System.out.println("Enter Base and Height : ");

        base = s.nextFloat();
        height = s.nextFloat();
        area = (base*height)/2;
        System.out.println("Area : " + area);

    }

}
*/

// Area of triangle with three sides

public class area{

    public static void main(String args[])
    {


        Scanner sc = new Scanner(System.in);

        int a,b,c;
        float area,s;

        System.out.println("Enter three sides of a triangle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        s = (a+b+c)/2;
        area = (float) (Math.sqrt(s*(s-a)*(s-b)*(s-c))/2f);

        System.out.println("Area : " +area);

    }

}











