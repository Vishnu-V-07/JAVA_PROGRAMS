package Basics;


/*
SYNTAX

Stringname.startsWith(String);

*/ 

public class startsWith
{
    public static void main(String args[])
    {
        String s1="Vishnu";
        boolean b1=s1.startsWith("V");
        boolean b2=s1.startsWith("i");
        System.out.println(b1);
        System.out.println(b2);
    }
}


/*
OUTPUT
true
false
*/
