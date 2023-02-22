import java.lang.*;
import java.util.*;
public class calculator {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);


        float a, b, c;

        int choice;

        for (int i = 1; i <= 2; i++) {
            System.out.println("--------------------------------Welcome to my calculator--------------------------------");
            System.out.println("1.Addition");
            System.out.println("2.Subtraction");
            System.out.println("3.Division");
            System.out.println("4.Multiplication\n");

            System.out.println("Select choice :\n");
            choice = s.nextInt();

            System.out.println("Enter two numbers : ");
            a = s.nextInt();
            b = s.nextInt();

            switch (choice) {
                case 1:
                    c = a + b;
                    System.out.println("Addition:\t" + c);
                    break;
                case 2:
                    c = a - b;
                    System.out.println("Subtraction:\t" + c);
                    break;
                case 3:
                    c = a / b;
                    System.out.println("Remainder:\t" + c);
                    break;
                case 4:
                    c = a * b;
                    System.out.println("Multiplication:\t" + c);
                    break;
                default:
                    System.out.println("Invalid choice ");
                    break;

            }

        }

    }
}