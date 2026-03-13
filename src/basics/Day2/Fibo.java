package basics.Day2;

import java.util.*;
public class Fibo
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Give the fibonacci series up to:");
        n=sc.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            System.out.print(a+" ");
            int c=a+b;
            a=b;
            b=c;
        }
        sc.close();
    }
}
