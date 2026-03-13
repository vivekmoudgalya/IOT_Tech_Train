package basics.Day3.overloading;

class Vehicle
{
    void speed()
    {
        System.out.println("Vehicles have different speed ranges");
    }
    void speed(int maxSpeed)
    {
        System.out.println("Maximum speed of the vehicle is :"+maxSpeed);
    }
}
public class Car extends Vehicle
{
    void speed(String mode)
    {
        System.out.println("car is running in "+mode+" mode.");
    }
    public static void main(String[] args)
    {
        Car c=new Car();
        c.speed();
        c.speed(100);
        c.speed("sports");
    }
}
