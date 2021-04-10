// Write a program to reverse a given linked list
// input:1 2 3 4
// output:
// Given Linked List
// 1 2 3 4
// Reversed Linked list
// 4 3 2 1
package DataStructure.linkedlist;
import java.util.*;
public class ReverseLinkedList {
    Node head;
    class Node{
        int data;
        Node next;
        Node(int d)
        {
            data=d;
            next=null;
        }
    }
    public void addNode(int data)
    {
        Node newnode=new Node(data);
        Node temp=head;
        if(head==null)
        {
            head=new Node(data);
            return;
        }
        while(temp.next!=null)
        {
            temp=temp.next;

        }
        temp.next=newnode;

    }
    public void display()
    {
        Node temp=head;
        while(temp.next!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;

        }
        System.out.println(temp.data);
    }
    public void reverseNode()
    {
        Node prev=null;
        Node current=head;
        Node next=null;
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        ReverseLinkedList l1=new ReverseLinkedList();
        l1.addNode(1);
        l1.addNode(2);
        l1.addNode(3);
        l1.addNode(4);
        System.out.println("Given Linked List");
        l1.display();
        l1.reverseNode();
        System.out.println("Reversed Linked list");
        l1.display();
    }
    
}
