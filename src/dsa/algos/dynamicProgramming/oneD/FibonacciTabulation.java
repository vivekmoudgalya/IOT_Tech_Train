package dsa.algos.dynamicProgramming.oneD;

public class FibonacciTabulation
{
    //in the tabulation code, we create the dp array inside the helper function
    public static int fib(int n)
    {
        //step 1: create a dp array of n+1 size(0-based indexing)
        //step 2: store gthe known values
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        //take a for loop from 2 till n[unknown values]
        for(int i=2;i<=n;i++)
        {
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
    public static void main(String[] args) {
        int n=7;
        System.out.println("Fibonacci at index "+ n + " is: "+fib(n));
    }
}