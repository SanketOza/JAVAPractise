package Static;

class HondaCityPrice {
    static long price = 10;
    int a, b;
    static double OnRoadPrice(String city)
    {
        double p = 0;
        switch (city) {
            case "Delhi":
                p = price + price * 0.1;
                break;
            case "Mumbai":
                p = price + price * 0.9;
                break;
            default:
                System.out.println("Invalid Price");

        }
        return p;
    }
}
public class HondaCity
{
   public static void main(String args[])
   {

       HondaCityPrice h1 = new HondaCityPrice();
       HondaCityPrice h2 = new HondaCityPrice();

      System.out.println( HondaCityPrice.OnRoadPrice("Delhi"));

   }

}
