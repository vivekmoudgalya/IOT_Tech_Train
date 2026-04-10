package dsa.dataStructures.nonLinear.heaps;

import java.util.PriorityQueue;
import java.util.Queue;

public class EmergencyRoom
{
    public static void main(String[] args) {
        Queue<Integer> severity=new PriorityQueue<>();
        //1 -> High priority
        //5 -> low Priority
        //3 -> medium priority
        severity.offer(5);
        severity.offer(3);
        severity.offer(1);
        System.out.println("The patient that get operated first is: "+severity.poll());

        System.out.println("Patient in queue: "+severity);
    }
}
