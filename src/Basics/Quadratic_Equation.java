import java.lang.*;
import java.util.Scanner;

public class Quadratic_Equation {

    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int a,b,c;

        float Quad1,Quad2;
        float delta;


        System.out.println("Enter Coefficients a,b,c : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        delta = (float) (b*b - (4*a*c));

        Quad1 = (float)((-b + Math.sqrt(delta))/(2*a));
        Quad2 = (float)((-b - Math.sqrt(delta))/(2*a));

        System.out.println("Roots :"+Quad1+Quad2);

    }

}
