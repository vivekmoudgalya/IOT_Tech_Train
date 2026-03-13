package dsa.algos.searching;


public class FirstLastTotalOccurance {
    public static int firstOcc(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key){
                //  Store the index & move to the extreme left for first occurance.
                ans=mid;
                end=mid-1;
            }
            else if (arr[mid]<key){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static int lastOcc(int[] arr, int key){
        int start=0;
        int end=arr.length-1;
        int ans=-1;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (arr[mid]==key){
                //  Store the index & move to the extreme right for last occurance.
                ans=mid;
                start=mid+1;
            }
            else if (arr[mid]<key){
                start=mid+1;
            }
            else {
                end=mid-1;
            }
        }
        return ans;
    }
    public static int totalOcc(int[] arr, int key){
        int fo=firstOcc(arr, key);
        int lo=lastOcc(arr, key);
        return lo-fo+1;
    }
    public static void main(String[] args) {
        int[] arr={1,2,3,3,3,4,5,6};
        int f=firstOcc(arr, 3);
        int l=lastOcc(arr, 3);
        int t=totalOcc(arr, 3);
        System.out.println("First Occurance Index: "+f);
        System.out.println("Last Occurance Index: "+l);
        System.out.println("Total Occurances: "+t);
    }
}