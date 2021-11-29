package Basics;
class ArrayIntializ{

    public static void main(String args[])
    {
        int arr[]={2,4,6};
        int arr2[]=new int[3];
        arr2[0]=1;
        arr2[1]=3;
        arr2[2]=5;
        System.out.println("Accessing element in first array");
        System.out.println("First element is "+arr[0]);
        System.out.println("second element is "+arr[1]);
        System.out.println("third element is "+arr[2]);
        System.out.println("Accessing element in second array");
        System.out.println("First element is "+arr2[0]);
        System.out.println("second element is "+arr2[1]);
        System.out.println("third element is "+arr2[2]);

    }
}


/*
OP:

Accessing element in first array
First element is 2
second element is 4
third element is 6
Accessing element in second array
First element is 1
second element is 3
third element is 5 
*/