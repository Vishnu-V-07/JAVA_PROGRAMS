package Basics;

/*
Syntax

string.replaceFirst(String regex,String replacement);
*/ 
class ReplaceFirst
{
    public static void main(String args[])
    {
        String s1="aabbddeeaa";
        String s2="hello123java12";
        System.out.println(s1.replaceFirst("aa","ee"));//eebbddeeaa
        System.out.println(s2.replaceFirst("\\d+"," "));//hello java12
     
      

    }
}

/*

OUTPUT

eebbddeeaa
hello java12
 */