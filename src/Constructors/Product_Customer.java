package Constructors;

import java.util.*;
import java.lang.*;

class Product
{

    private String item_no; // Alphanumeric
    private String name;

    private double price;

    private short quantity;

    public String getItem_no()
    {
        return item_no;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice()
    {
        return price;
    }

    public short getQuantity()
    {
        return quantity;
    }

    public void setPrice(double p)
    {
        price = p;
    }
    public void setQuantity(short q)
    {
        quantity = q;
    }
    public Product(String i,String n)
    {
        item_no = i;
        name = n;
    }

    public String details()
    {
        return "Product name : "+getName()+"\nItem no : "+getItem_no()
                +"\nPrice : "+getPrice()+"\nQuantity : "+getQuantity();
    }

}
public class Product_Customer {

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        Product p = new Product("A1","FOOD");

        System.out.println("Enter Price : ");
        double pr = sc.nextDouble();
        p.setPrice(pr);
        System.out.println("Enter Quantity : ");
        short qr = sc.nextShort();
        p.setQuantity(qr);
        System.out.println("Details : \n"+p.details());

    }
}
