class Node{
    int data;
    Node next;
    

    Node(int data)
    {
        this.data=data;
        next=null;
      

    }
}
public class SinglyLinkedlist {
    Node head,tail;

    SinglyLinkedlist()
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
            tail=temp;
        }
    }
    void delete(int data)
    {
        Node temp=head;
        Node prev=head;
        while(temp!=null)
        {
            if(temp.data==data)
            {
                if(temp==head)
                {
                    head=head.next;
                }
                else if(temp==tail)
                {
                    tail=prev;
                    tail.next=null;
                }
                else{
                    prev.next=temp.next;
                   
                }
            }
            prev=temp;
            temp=temp.next;
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
            
            System.out.print(temp.data);
            
            
        }
     }   
    
    public static void main(String args[])
    {
      
        SinglyLinkedlist sl=new SinglyLinkedlist();
        sl.add(40);
        sl.add(50);
        sl.add(60);
        sl.display();
        System.out.println();
        sl.reverse();
        System.out.println();
        sl.display();
        sl.delete(50);
        sl.display();
        sl.delete(40);
        sl.display();
        
    }
}
