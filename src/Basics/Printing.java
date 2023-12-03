import java.lang.*;
import java.util.Scanner;
public class Printing {


    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        int a,b,c;

        System.out.println("Enter Two Numbers : ");
        a = s.nextInt();
        b = s.nextInt();
        c = a + b;

       System.out.println("Sum of "+a+ " and " +b+ " is: " +c);
       System.out.println("Sum of " +a+ " and " +b+ " is: " +(a+b));

    }

}
