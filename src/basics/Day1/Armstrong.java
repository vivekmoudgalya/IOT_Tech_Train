package basics.Day1;

import java.util.*;
class Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int temp=n,sum=0;
        int count=0;
        while(temp!=0)
        {
            count++;
            temp=temp/10;
        }
        temp=n;
        while(temp!=0)
        {
            int d=temp%10;
            sum+=Math.pow(d,count);
            temp=temp/10;
        }
        if(n==sum)
        {
            System.out.println("Armstrong");
        }
        else
        {
            System.out.println("Not Armstrong:");
        }
    }
}