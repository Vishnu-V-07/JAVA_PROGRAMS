package Basics;



/*
SYNTAX
string.compareTo(String s1);

*/



public class compareTo {
    
    public static void main(String args[])
    {
        String s1="Hello Java";
        String s2="Hello Java";
        String s3="Hello Python";

        System.out.println(s1.compareTo(s2));//0
        System.out.println(s1.compareTo(s3));//-6
        System.out.println(s3.compareTo(s1));//6


    }
}

/*

OUTPUT
0
-6
6


*/
