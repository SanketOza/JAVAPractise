package Strings;

import java.lang.*;
import java.util.*;

public class ProtocolfFromWebsite {

    public static void main(String args[])
    {
        Scanner sc  = new Scanner(System.in);

        String url;

        System.out.println("Enter URL ");
        url = sc.nextLine();

        String protocol = url.substring(0,url.indexOf(":"));
        String domain = url.substring(url.lastIndexOf(".")+1);

        if (protocol.equals("http"))
        {
            System.out.println("Hypertext Transfer Protocol");
        }
        else if (protocol.equals("ftp"))
        {
            System.out.println("File Transfer Protocol");
        }

        if(domain.equals("com"))
        {
            System.out.println("Commercial");
        } else if (domain.equals("org"))
        {
            System.out.println("Organization");
        }


    }








}
