package Exception_Handling;

public class Exception_0 {

/*
public static void main(String args[])
{
    Scanner sc = new Scanner(System.in);

//try-catch block;
    try {
        int a = sc.nextInt();
        int b = sc.nextInt();

        float c = b / a;
        System.out.println("div: "+c);
    }
    catch(ArithmeticException e)
    {
        System.out.println("Arithmetic Excpetion infinite value " +e);

    }


}
 */


    //Multiple try-catch block;
    /*
    public static void main(String args[])
    {
        int A[] = {1,2,3,4,5};

        float r;


        try{

            r = A[1]/A[0];
            System.out.println(r);
            System.out.println(A[10]);
        }
        catch(ArithmeticException e)
        {
            System.out.println("infinite "+e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("check length "+e);
        }

    }
         */

    //Nested try-catch block;
    /*

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5};

        float r;

        try{
            try{
                r = arr[1]/arr[0];
                System.out.println(r);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Arithmetic Exception"+e);
            }
            System.out.println(arr[0]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("check length" +e);

        }

}

     */

// using catch(Exception e) to handle any type of exception;
    /*

    public static void main(String[] args) {
        int[] arr = {0,2,3,4,5};

        float r;

        try{
            try{
                r = arr[1]/arr[0];
                System.out.println(r);
            }
            catch (ArithmeticException e)
            {
                System.out.println("Arithmetic Exception"+e);
            }
            System.out.println(arr[10]);
        }
        catch(Exception e)
        {
            System.out.println("check length" +e);

        }

    }

*/

    //Checked and Unchecked Exceptions;















}
