package atm.exe_time;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class TimeOfOperationsWithLists {

    static long calculateExeTimeForArrayListAdding() {
        ArrayList<Integer> array = new ArrayList<Integer>();
        long arrayStartTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            array.add(i);
        }
        long arrayEndTime = System.nanoTime();
        long arrayExeTime = TimeUnit.MICROSECONDS.convert((arrayEndTime - arrayStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time in microseconds for adding elements into array: " + arrayExeTime);
        return arrayExeTime;
    }

    static long calculateExeTimeForLinkedListAdding() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        long linkedStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long linkedEndTime = System.nanoTime();
        long LinkedExeTime = TimeUnit.MICROSECONDS.convert((linkedEndTime - linkedStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time in microseconds for adding elements into LinkedList: " + LinkedExeTime);
        return LinkedExeTime;
    }

    static long calculateExeTimeForHashSetAdding() {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        long hashSetStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        long hashSetEndTime = System.nanoTime();
        long hashSetExeTime = TimeUnit.MICROSECONDS.convert((hashSetEndTime - hashSetStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time in microseconds for adding elements into HashSet: " + hashSetExeTime);
        return hashSetExeTime;
    }

    static long calculateExeTimeForTreeSetAdding() {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        long treeSetStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }
        long treeSetEndTime = System.nanoTime();
        long treeSetExeTime = TimeUnit.MICROSECONDS.convert((treeSetEndTime - treeSetStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time in microseconds for adding elements into TreeSet: " + treeSetExeTime);
        return treeSetExeTime;
    }

    static long calculateExeTimeForHashMapAdding() {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        long hashMapStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            hashMap.put(i, i);
        }
        long hashMapEndTime = System.nanoTime();
        long hashMapExeTime = TimeUnit.MICROSECONDS.convert((hashMapEndTime - hashMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time in microseconds for adding elements into HashMap: " + hashMapExeTime);
        return hashMapExeTime;
    }

    static long calculateExeTimeForTreeMap() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        long treeMapStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeMap.put(i, i);
        }

        long treeMapEndTime = System.nanoTime();
        long treeMapExeTime = TimeUnit.MICROSECONDS.convert((treeMapEndTime - treeMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time in microseconds for adding elements into TreeMap: " + treeMapExeTime);
        return treeMapExeTime;

    }
}
