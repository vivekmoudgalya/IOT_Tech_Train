package basics.Day2;

import java.util.*;
class StrongNumber
{
    int factorial(int d)
    {
        int fact=1;
        for(int i=1;i<=d;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
    boolean isStrong(int n)
    {
        int temp=n;
        int sum=0;
        while(n!=0)
        {
            int d=n%10;
            sum=sum+factorial(d);
            n=n/10;
        }
        if(sum==temp)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        StrongNumber sn=new StrongNumber();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(sn.isStrong(n))
        {
            System.out.println("Strong number");
        }
        else
        {
            System.out.println("not a Strong Number");
        }
    }
}