import java.lang.*;
import java.util.*;



public class Sumofn{

public static void main(String args[])
{
    Scanner s = new Scanner(System.in);

    System.out.println("Enter N : ");

    int n;
    n = s.nextInt();


    int sum = (n * (n + 1)) / 2;

    System.out.println("Sum : "+sum);

}


}
