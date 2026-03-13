package basics.Day3.oop;

public class Animal
{
    void print()
    {
        System.out.println("Sound");
    }
}
class cat extends Animal
{
    void sound()
    {
        System.out.println("meow");
    }
}
class dog extends cat
{
    void bark()
    {
        System.out.println("bow");
    }
}