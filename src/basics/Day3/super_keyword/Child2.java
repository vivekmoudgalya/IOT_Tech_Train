package basics.Day3.super_keyword;

public class Child2 extends Parent
{
    int x=20;
    void show()
    {
        super.print();
        System.out.println(x);
        System.out.println(super.x);
    }
    public static void main(String[] args)
    {
        Child2 ob=new Child2();
        ob.show();
    }
}
