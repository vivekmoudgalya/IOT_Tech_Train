package dsa.dataStructures.linear.queues;

import java.util.Deque;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;

public class SlidingWindowDequeue {
    public static void main(String[] args) {
        int[] arr={1,3,-1,-3,5,3,6,7};
        int k=3;
        Deque<Integer> dq=new LinkedList<>();
        for(int i=0;i<arr.length;i++){
            if(!dq.isEmpty()&& dq.peek()==i-k){
                dq.pollFirst();
            }
            //remove smaller elements
            while(!dq.isEmpty()&&arr[dq.peekLast()]<arr[i]){
                dq.pollLast();

            }
            dq.addLast(i);
            //print max
            if(i>=k-1){
                System.out.print(arr[dq.peekFirst()]+" ");
            }
        }
    }
}
