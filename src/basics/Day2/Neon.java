package basics.Day2;

import java.util.*;
public class Neon
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int square=n*n;
        int sum=0;
        while(square>0)
        {
            sum+=square%10;
            square/=10;
        }
        if(sum==n)
        {
            System.out.println(n+" is a neon number");
        }
        else
        {
            System.out.println(n+" is not a neon number");
        }
    }
}