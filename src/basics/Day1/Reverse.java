package basics.Day1;
import java.util.*;
class Reverse
{
    public static void main(String[] args)
    {
        int n,rev=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        n=sc.nextInt();
        while(n>0)
        {
            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
            sc.close();
        }
        System.out.println(rev);
    }
}
