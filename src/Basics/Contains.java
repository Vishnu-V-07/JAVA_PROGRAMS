package Basics;

/*Syntax

string.contains(CharSequence);

*/

public class Contains{


    public static void main(String args[])
    {
        String s1="Hello Java";

        boolean b1=s1.contains("Java");
        System.out.println(b1);//true
        boolean b2=s1.contains("Python");
        System.out.println(b2);//false
    }
}

/*

true
false

 */
