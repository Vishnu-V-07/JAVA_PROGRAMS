// Create a linked list from scratch.Define a class called Node and have a String data as the value
// write a function to addNode to add the first n nodes as Strings
// Write a fuction to insertNode to add a node in between 2 nodes in th linked list
// Write a another function to display it.
// Input:
// 5
// hello
// how
// are
// you
// today
// 3
// insert
// Output:
// Nodes of singly linked list: hello how are you today
// Nodes of singly linked list: hello how are insert you today
package DataStructure.linkedlist;
import java.util.*;
public class LinkedList3 {
    Node head;
    class Node{
        String data;
        Node next;
        Node(String d)
        {
            data=d;
            next=null;
        }
    }
    public void addNode(String data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=new Node(data);
            return;
            
        }
        newnode.next=null;
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=newnode;
        
    }
    public void insertNode(int position,String data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        int j=0;
        while(temp.next!=null)
        {
            if(j==position-1)
            {
                newnode.next=temp.next;
                temp.next=newnode;
                j++;
            }
            else{
                temp=temp.next;
                j++;
            }
        }
        
    }
    public void display()
    {
        System.out.print("Nodes of singly linked list: ");
         Node temp=head;
         while(temp.next!=null)
         {
             System.out.print(temp.data+" ");
             temp=temp.next;
         }
         System.out.print(temp.data+" ");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        LinkedList3 l1=new LinkedList3();
        int iNum=sc.nextInt();
        for(int i=0;i<iNum;i++)
        {
            l1.addNode(sc.next());
        }
        int insert=sc.nextInt();
        String s2=sc.next();
        l1.display();
        System.out.println();
        l1.insertNode(insert,s2);
        l1.display();
    }
}
