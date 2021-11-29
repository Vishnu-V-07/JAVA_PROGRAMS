package Basics;

/*

SYNTAX

String.join(CharSequence delimiter,CharSequence..elements);

 */
public class joinString {

    public static void main(String args[])
    {
        String s1="Hi";
        String s2="Hello";
        String s3="Welcome";

        String s4=String.join(" ",s1,s2,s3);
        System.out.println(s4);
    }
    
}


/*
OUTPUT

Hi Hello Welcome
*/ 
