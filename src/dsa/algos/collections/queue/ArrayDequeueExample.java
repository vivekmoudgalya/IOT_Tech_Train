package dsa.algos.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeueExample
{
    public static void main(String[] args) {
        Deque<String> actions=new ArrayDeque<>();
        actions.addLast("User Types A");
        actions.addLast("User Types B");
        actions.addLast("User Deletes B");
        System.out.println("undo: "+actions.removeLast());
        System.out.println("Remaining Actions: "+actions);
    }
}

