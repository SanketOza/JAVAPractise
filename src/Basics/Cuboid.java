import java.lang.*;
import java.util.Scanner;
public class Cuboid {

    public static void main(String args[])
    {    Scanner sc = new Scanner(System.in);

    float totalarea,volume;
    int l,b,h;

    System.out.println("Ente length, base, height : ");
    l = sc.nextInt();
    b = sc.nextInt();
    h = sc.nextInt();


    totalarea = (float) (2*(l*b+l*h+b*h));
    volume = (float) (l*b*h);

    System.out.println("TotalArea : "+totalarea);
    System.out.println("Volume : " +volume);


}

}
