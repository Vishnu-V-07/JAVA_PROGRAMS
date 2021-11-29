package Basics;

/*
SYNTAX:

string.split(String regex);

*/
class split
{
    public static void main(String args[])
    {
       String s1="Hi hello Welcome";
       String arr[]=s1.split(" ");//arr[0]=Hi,arr[1]=hello,arr[2]=Welcome
       for(String s2:arr)
       {
            System.out.println(s2);
       }
    }
}

/*
OUTPUT:

Hi
hello
Welcome

*/