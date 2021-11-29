package Basics;



/*
SYNTAX
string.compareToIgnoreCase(String s1);

*/
public class compareToIgnoreCase {
    
    public static void main(String args[])
    {
        String s1="Hello Java";
        String s2="Hello java";
        

        System.out.println(s1.compareToIgnoreCase(s2));//0
        System.out.println(s1.compareTo(s2));//-32
        


    }
}

/*

OUTPUT
0



*/

