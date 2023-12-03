package Strings;

public class Quantifiers_Matching {

    public static void main(String args[])
    {

        // use of * :- yeh check karega ki joh string tum chahte ho uske characters hai kya diye wale string mai , bhale hi kitne hi;
        //baar kyu na ho;

        String str1 = "aabbcc";
        System.out.println(str1.matches("[abc]*"));

        // Use of + :-  ek baar yaa usse jyaada baar toh character rehna chahiye string me match karen ke liye;

        System.out.println(str1.matches("[ab]+"));

        // Use of ? :- sirf 0 or ek baar hi rehna chahiye nhi toh false;
        String str2 = "abc";
        System.out.println(str1.matches("[abc]?"));

        //Use of {x} :- matlab itne times rehna chahiye;

        System.out.println(str2.matches("[abc]{3}}"));

        //Use of {x,y} :- matlab itne range mai rehna chahiye;

        System.out.println(str1.matches("[abc]{3,7}")); // 3 se 7 ke bich me letter hai string mai toh true return hoga;
    }




}
