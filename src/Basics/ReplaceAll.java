package Basics;

/*
Syntax

string.replaceAll(String regex,String replacement);
*/ 
class ReplaceAll
{
    public static void main(String args[])
    {
        String s1="aabbddeeaa";
        String s2="hello123java";
        System.out.println(s1.replaceAll("aa","ee"));//eebbddeeee
        System.out.println(s2.replaceAll("\\d+"," "));//hello java
     
      

    }
}

/*

OUTPUT

eebbddeeee
hello java
 */