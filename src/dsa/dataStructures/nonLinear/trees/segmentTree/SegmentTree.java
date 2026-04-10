package dsa.dataStructures.nonLinear.trees.segmentTree;

import java.util.Scanner;

public class SegmentTree
{
    private static final int MAX_SIZE=10005;//maximum size of tree
    private static int[] a=new int[MAX_SIZE];//input array
    private static int[] seg=new int[4*MAX_SIZE];//segment tree
    //Function to build the segment tree
    private static void build(int ind,int low,int high)
    {
        if(low==high)
        {
            seg[ind]=a[low];//leaf node will have a single element
            return;
        }
        int mid=(low+high)/2;
        build(2*ind+1,low,mid);//build left child
        build(2*ind+2,mid+1,high);//build right child
        seg[ind]=Math.max(seg[2*ind+1],seg[2*ind+2]);//store maximum
    }
    // function to query the maximum in a given range[l,r]
    private static int query(int ind,int low,int high,int l,int r)
    {
        if(low>=l&&high<=r)
        {//completely overlap
            return seg[ind];

        }
        if(high < l || low > r)
        {
            //low,high[0,2] l,r[3,8]
            //no overlap
            return Integer.MIN_VALUE;//return minimum possible value
        }
        int mid=(low+high)/2;//partial overlap
        int left=query(2*ind+1,low,mid,l,r);//query left child
        int right=query(2*ind+2,mid+1,high,l,r);//query right child
        return Math.max(left,right);//return the max of both the children

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();//size of the input array
        System.out.println("Enter the elements: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        build(0,0,n-1);//build the segment tree
        System.out.println("Enter the number of queries: ");
        int q=sc.nextInt();
        while(q-->0)
        {
            System.out.println("Enter the range [l,r]: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int result=query(0,0,n-1,l,r);
            System.out.println("Maximum in range["+l+", "+r+"] is: "+result);
        }
        sc.close();
    }
}
