package Basics;

/*
Syntax

string.replace(char oldchar,char newChar);
*/ 
class ReplaceString
{
    public static void main(String args[])
    {
        String s1="Hello world";
        System.out.println(s1.replace('H','C'));//Cello world
        System.out.println(s1.replace("Hello","Hi"));//Hi world
        System.out.println(s1.replace('Z','C'));//Hello world

    }
}

/*

OUTPUT

Cello world
Hi world
Hello world
 */