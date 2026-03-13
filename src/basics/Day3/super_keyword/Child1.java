package basics.Day3.super_keyword;

class Parent1
{
    Parent1()
    {
        System.out.println("Parent");
    }
}
public class Child1 extends Parent1
{
    Child1()
    {
        super();
        System.out.println("Child1");
    }
    public static void main(String[] args)
    {
        Child1 ch=new Child1();
    }
}
