package dsa.algos.searching;


public class SquareRootBinarySearch {
    public static int sqrt_bs(int n){
        int start=0;
        int end=n;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            int square=mid*mid;
            if (square==n){
                return mid;
            }
            else if (square>n){
                end=mid-1;  // Go to the left hand side.
            }
            else{
                // Store the probable answer & move to the right.
                ans=mid;  // The mid-value is stored in the answer.
                start=mid+1;  // We move to the right to find accurate answer.
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(sqrt_bs(36));
        System.out.println(sqrt_bs(37));
    }
}
