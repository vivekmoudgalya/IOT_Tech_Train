package dsa.algos.collections.sets;

import com.sun.source.tree.Tree;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard
{
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>(Collections.reverseOrder());
        scores.add(450);
        scores.add(200);
        scores.add(125);
        scores.add(320);
        scores.add(197);
        System.out.println("LeaderBoard Stats: "+scores);
    }
}