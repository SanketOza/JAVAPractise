package Array;

import java.util.*;
import java.lang.*;
public class Sorted_Array_of_Strings {

    public static void main(String args[])
    {
        String arr[] = {"java","pascal","python","smalltalk","ada","basic"};
        java.util.Arrays.sort(arr);

        for (String x: arr)                                                                                                                                                     
        {
            System.out.println(x);
        }
    }


}
