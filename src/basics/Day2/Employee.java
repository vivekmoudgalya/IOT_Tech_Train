package basics.Day2;

public class Employee
{
    String name;
    int id;
    double salary;

    Employee(String n,int num,double sal)
    {
        name=n;
        id=num;
        salary=sal;
    }
    void display()
    {
        System.out.println(name+" "+id+" "+salary+" ");
    }
    public static void main(String[] args)
    {
        Employee emp1=new Employee("Vivek",124,50000);
        Employee emp2=new Employee("Babu",128,50000.0);
        emp1.display();
        emp2.display();
    }
}