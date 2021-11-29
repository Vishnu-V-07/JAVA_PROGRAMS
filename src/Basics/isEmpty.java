package Basics;


/*
SYNTAX

Stringname.isEmpty();

*/ 

public class isEmpty {
    
    public static void main(String args[])
    {
        String s1="Java";
        String s2="";
        boolean b1=s1.isEmpty();
        boolean b2=s2.isEmpty();
        System.out.println(b1);
        System.out.println(b2);
    }
}

/*
OUTPUT

false
true
*/

