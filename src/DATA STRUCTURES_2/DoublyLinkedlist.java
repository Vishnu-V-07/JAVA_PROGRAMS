import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;

    Node(int value)
    {
        data=value;
        next=null;
        prev=null;
    }
    
}
class DoublyLinkedlist{
    Node head,tail;
    
    DoublyLinkedlist()
    {
        head=null;
        tail=null;
    }

    public void add(int data)
    {
        Node temp=new Node(data);
        if(head==null)
        {
            head=temp;
            tail=temp;
        }
        else{
            tail.next=temp;
             temp.prev=tail;
             tail=temp;
        }

    }
    public void delete(int data)
    {
        Node temp=head;
        while(temp.data!=data)
        {
            temp=temp.next;
        }
        if(temp==null)
        {
            System.out.println("element not found");
        }
        else{
            if(temp==head)
            {
                head=head.next;
                head.prev=null;
            }
            else if(temp==tail)
            {
                tail=tail.prev;
                tail.next=null;
            }
            else if(temp!=head && temp!=tail){
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            }
        }
    }
    public void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public void reverse()
    {
        Node temp=tail;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }

    
     public static void main(String args[])
     {
         DoublyLinkedlist dl=new DoublyLinkedlist();
         dl.add(10);
         dl.add(20);
         dl.add(30);
         dl.display();
         dl.reverse();
         System.out.println();
         dl.display();
         dl.delete(10);
         dl.display();
         dl.delete(20);
         dl.display();
         dl.delete(30);
         dl.display();
     }
}