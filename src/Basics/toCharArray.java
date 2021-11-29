package Basics;


/*
SYNTAX

String.toCharArray();

*/ 
public class toCharArray {

    public static void main(String args[])
    {
        String s1="Hello Java";
        char arr[]=s1.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }

    }
    
}

/*
OUTPUT
H
e
l
l
o

J
a
v
a
*/
