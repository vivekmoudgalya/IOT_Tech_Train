package dsa.dataStructures.linear.linkedList.problems.PalindromeList;
import java.util.Stack;

class ListNode
{
    int data;
    ListNode next;
    ListNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
public class PalindromeLinkedList
{
    public static boolean isPalindrome(ListNode head)
    {
        Stack<Integer> stack=new Stack<>();
        ListNode temp=head;
        //traverse the first time to push all elements into the stack
        while(temp!=null)
        {
            stack.push(temp.data);
            temp=temp.next;

        }
        temp=head;
        //now compare the nodes with stack top elements
        while(temp!=null)
        {
            if(temp.data!=stack.pop())
            {
                return false;
            }
            temp=temp.next;
        }
        return true;
    }
    public static void main(String[] args) {
        ListNode head1=new ListNode(1);
        head1.next=new ListNode(2);
        head1.next=new ListNode(1);
        System.out.println(isPalindrome(head1)?"Palindrome":"Not Palindrome");
        ListNode head2=new ListNode(1);
        head2.next=new ListNode(2);
        head2.next=new ListNode(3);
        System.out.println(isPalindrome(head2)?"Palindrome":"Not Palindrome");
    }
}
