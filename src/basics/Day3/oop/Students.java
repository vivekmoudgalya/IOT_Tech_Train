package basics.Day3.oop;
//encapsulation
public class Students
{
    private String name;
    private int age;
    Students(String n,int a)
    {
        name=n;
        age=a;
    }
    public String getname()
    {
        return name;
    }
    public void setname(String name)
    {
        this.name=name;
    }
}