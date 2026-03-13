package basics.Day3.overloading;

class Parent
{
    void show()
    {
        System.out.println("Parent static method");
    }
}
public class Child extends Parent
{
    void show()
    {
        System.out.println("Child Static method");
    }
    public static void main(String[] args)
    {
        Parent obj=new Parent();
        obj.show();
    }
}
