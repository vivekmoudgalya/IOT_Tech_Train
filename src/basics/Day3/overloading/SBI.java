package basics.Day3.overloading;

class Bank
{
    void interest()
    {
        System.out.println("Bank provides interest on deposits");
    }
    void interest(double rate)
    {
        System.out.println("The interest rate is: "+rate);
    }
}
public class SBI extends Bank
{
    void interest(double rate,int years)
    {
        int p=1000;
        double total=(p*rate*years)/100;
        System.out.println("The total interest is: "+total);
    }
    public static void main(String[] args)
    {
        SBI sbi=new SBI();
        sbi.interest();
        sbi.interest(5.0);
        sbi.interest(5.0,3);
    }
}