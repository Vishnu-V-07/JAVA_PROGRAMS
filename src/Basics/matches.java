package Basics;


/*
SYNTAX

String.matches(regex);

*/ 

public class matches
{
    public static void main(String args[])
    {
        String s1="Vishnu";
        String s2="^V....u$";
        boolean b1=s1.matches(s2);
        System.out.println(b1);
    }
}


/*
OUTPUT
true
*/
