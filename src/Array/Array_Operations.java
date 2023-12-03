package Array;

import java.util.*;
import java.lang.*;
public class Array_Operations {

// Insertion of element in array;
    /*
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int size = 6;

        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+",");
        }

        int position;
        int value;

        position = sc.nextInt();
        value=sc.nextInt();

        for(int i=size+1;i>position;i--)
        {
            arr[i]=arr[i-1];
        }
        arr[position] = value;

        for(int i=0;i<size+1;i++)
        {
            System.out.print(arr[i]+",");
        }


    }
*/
// Program for deletion of element from specific element in array;
    /*
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int arr[] = new int[10];

        int size = 6;

        System.out.println("Enter elements in array : ") ;
        for(int i=0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Elements in array are : ");
        for (int i=0;i<size;i++)
        {
            System.out.print(arr[i]+",");
        }

        System.out.println("\nEnter position for insertion : ");
        int position_insert;
        int value_insert;
        position_insert = sc.nextInt();
        System.out.println("\nEnter value to insert : ");

        value_insert = sc.nextInt();

        for(int i = size;i>position_insert;i--)
        {
            arr[i] = arr[i-1];
        }
        arr[position_insert] = value_insert;


        System.out.println("Array after insertion is : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+",");
        }


        System.out.println("\nEnter position whose element you want to remove : ");
        int position_delete;
        position_delete = sc.nextInt();

        for(int i =0;i<size;i++)
        {
            if(arr[i]==position_delete)
            {
                arr[i] = arr[i+1];

            }
        }

        System.out.println("\nArray after deletion is : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+",");
        }
*/

// Program for copying an array into another array;

    /*
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int A[] = {1,2,3,4,5,6};
        int B[] = new int[6];

        System.out.println("Elements of Array 'A' are :- ");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }

        System.out.println("\nElements of Array 'B' are :- ");
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
*/

// Program for reverse copying elements of one array into another;
/*
    public static void main(String args[])
    {

        Scanner sc = new Scanner(System.in);

        int A[] = {1,2,3,4,5,6};
        int B[] = new int[6];

        System.out.println("Elements of Array 'A' are :- ");
        for(int i=0;i<A.length;i++)
        {
            System.out.print(A[i]+" ");
        }


        for(int i=A.length-1,j=0;i>=0;i--,j++)
        {
            B[j] = A[i];
        }

        System.out.println("\nElements of Array 'B' are :- ");
        for(int i=0;i<B.length;i++)
        {
            System.out.print(B[i]+" ");
        }
*/

    /*
    public static void main(String args[])
    {
        int A[] = {1,2,3,4,5,6};
        int B[] = new int[2*A.length];

        System.out.println(A.length);

        for(int i=0;i<A.length;i++)
        {
            B[i]=A[i];
        }
        A = B;
        B = null;

        System.out.println(A.length);



    }
*/







}