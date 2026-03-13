package basics.Day3.overloading;

public class Calculator
{
    static void calci(int a,int b)
    {
        System.out.println(a+b);
    }
    static void calci(double a,double b)
    {
        System.out.println(a*b);
    }
    static int calci(int a,int b,int c)
    {
        return (a+b)/c;
    }
    public static void main(String[] args)
    {
        calci(5,8);
        calci(10.9,7.9);
        System.out.println(calci(12,34,2));
    }
}