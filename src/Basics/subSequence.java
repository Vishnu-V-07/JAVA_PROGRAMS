package Basics;


/*
SYNTAX

Stringname.subSequence(startindex,endindex);

*/ 

public class subSequence {
    
    public static void main(String args[])
    {
        String s1="Hello Java";
        CharSequence cs=s1.subSequence(4,9);//o Jav
        
        System.out.println(cs);
        
    }
}

/*
OUTPUT

o Jav

*/

