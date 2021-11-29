package Basics;


/*
  string.substring(int startIndex, int endIndex);
*/

public class substring {


    public static void main(String args[])
    {
        String s1="Hello Java";
        System.out.println(s1.substring(0,5));//0,5-1=>0,4//Hello
        System.out.println(s1.substring(0));//Hello Java
        System.out.println(s1.substring(6));//Java
    }
    
}


/*
Hello
Hello Java
Java
 */