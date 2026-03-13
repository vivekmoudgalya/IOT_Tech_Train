package basics.Day3.oop;

//encapsulation


public class Main
{
    public static void main(String[] args)
    {
        Students ob=new Students("Vivek",124);
        System.out.println(ob.getname());
        ob.setname("Moudgalya");
        System.out.println(ob.getname());
    }
}