package basics.Day2;

public class Counter
{
    static int count=0;
    int id;
    Counter()
    {
        count++;
        id=count;
        System.out.println("Object ID:"+id);

    }
    public static void main(String[] args)
    {
        Counter c1=new Counter();
        Counter c2=new Counter();
        Counter c3=new Counter();
        System.out.println("Total objects created:"+count);
    }
}