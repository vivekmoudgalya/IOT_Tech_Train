package dsa.dataStructures.linear.linkedList;


import java.sql.SQLOutput;

class LL {
    Node head;
    private int size;
    LL()
    {
        size=0;
    }

    public class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;//we don't know the address of the next node
            size++;//Increment the size as soon as a node is created
        }
    }
    public void printList()
    {
        Node curr=head;
        while(curr!=null)
        {
            System.out.print(curr.data+" --> ");
            curr=curr.next;
        }
        System.out.println("null");
    }
    public void addFirst(String data)
    {
        //create a new node
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data)
    {
        //create a new node
        Node newNode=new Node(data);
        //empty list
        if(head==null)
        {
            head=newNode;
            return;
        }
        Node last=head;
        while(last.next!=null)
        {
            last=last.next;
        }
        //at the end of this loop we will stand at the last node
        //point the last node next pointer to the new node
        last.next=newNode;
    }
    public void removeFirst()
    {
        //Empty list -> cannot remove thr head node.
        if(head==null)
        {
            System.out.println("List is empty . Can't delete the head!");
            return;
        }
        //for a single n ode, the head will point to the next (null)
        //for multiple nodes, the head will point to the next (head.next)
        head=this.head.next;
    }
    public void removeLast()
    {
        //empty list -> cannot remove the tail mode
        if(head==null)
        {
            System.out.println("List is empty. Can't delete the tail!");
            return;
        }
        //Single element in the list
        if(head.next==null)
        {
            head=null;//C/C++ style of code
            return;
        }
        //multiple elements in the list
        Node curr=head;
        Node last=head.next;
        while(last!=null)
        {
            curr=last;
            last=last.next;
        }
        //the last node will be cleared by the JVM if not used
        //so we point the secondLast(curr) node to null pointer
        curr.next=null;
        size--;
    }
    public void removeTarget(String target)
    {
        //empty list -> cannot remove the tail mode
        if(head==null)
        {
            System.out.println("List is empty. Can't delete the target!");
            return;
        }
        //case : target is the head node itself
        if(head.data.equals(target))
        {
            head=head.next;
            size--;
            return;
        }
        //case : target in the list
        Node prev=null;
        Node curr=head;
        while(curr!=null&&!curr.data.equals(target))
        {
            prev = curr;
            curr=curr.next;
        }
        //do a check to see if the curr pointer is null
        //if its null,the target is not found
        if(curr==null)
        {
            System.out.println("Target not found in the list");
            return;
        }
        prev.next=curr.next;//adjust the previous node and current node
        size--;
    }
    public static void main(String[] args) {
        LL sll = new LL();
        sll.addFirst("DSA");
        sll.addFirst("Learning");
        sll.addFirst("are");
        sll.addFirst("We");
        sll.printList();
        sll.addLast("in");
        sll.addLast("Java");
        sll.addLast("at");
        sll.addLast("SCE");
        sll.printList();
        sll.removeFirst();
        sll.printList();
        sll.removeLast();
        sll.printList();
        sll.removeTarget("Learning");
        sll.printList();
        sll.removeTarget("Python");
    }
}
