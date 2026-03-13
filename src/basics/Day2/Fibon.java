package basics.Day2;

public class Fibon
{
    public void fibonacci(int n)
    {
        int a=0,b=1,sum=0;
        System.out.println("Fibonacci Series:");
        for(int i=0;i<=n;i++)
        {
            System.out.print(a+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
    public static void main(String[] args)
    {
        Fibon f=new Fibon();
        f.fibonacci(8);
    }
}
