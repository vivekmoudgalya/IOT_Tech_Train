package basics.Day2;

public class ex1
{
    int a;
    int b;
    void display()
    {
        System.out.println(a);
        System.out.println(b);
    }
    public static void main(String[] args)
    {
        ex1 ex=new ex1();
        ex.a=10;
        ex.b=20;
        ex.display();
    }
}
