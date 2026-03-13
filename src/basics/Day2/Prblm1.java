package basics.Day2;

import java.util.*;
public class Prblm1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=sc.nextInt();
        int count=0;
        while(n!=0)
        {
            count+=(n & 1);
            n>>=1;
        }
        System.out.println("the number of 1's in the number: "+count);
    }
}