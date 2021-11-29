package Basics;


/*
SYNTAX

Stringname.endsWith(String);

*/ 

public class endsWith
{
    public static void main(String args[])
    {
        String s1="Vishnu";
        boolean b1=s1.endsWith("u");
        boolean b2=s1.endsWith("i");
        System.out.println(b1);
        System.out.println(b2);
    }
}


/*
OUTPUT
true
false
*/
