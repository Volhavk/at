package atm.exe_time;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class TimeOfOperationsWithLists {


    public static long calculateExeTimeForArrayListAdding() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        long arrayStartTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long arrayEndTime = System.nanoTime();
        long arrayExeTime = TimeUnit.MICROSECONDS.convert((arrayEndTime - arrayStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for adding elements into arrayList: " + arrayExeTime);
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
        System.out.println("Time for adding elements into LinkedList: " + LinkedExeTime);
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
        System.out.println("Time for adding elements into HashSet: " + hashSetExeTime);
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
        System.out.println("Time for adding elements into TreeSet: " + treeSetExeTime);
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
        System.out.println("Time for adding elements into HashMap: " + hashMapExeTime);
        return hashMapExeTime;
    }

    static long calculateExeTimeForTreeMapAdding() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        long treeMapStartTime = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            treeMap.put(i, i);
        }
        long treeMapEndTime = System.nanoTime();
        long treeMapExeTime = TimeUnit.MICROSECONDS.convert((treeMapEndTime - treeMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for adding elements into TreeMap: " + treeMapExeTime);
        return treeMapExeTime;
    }

    static long timeOfGettingNumberFromArray() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long arrayStartTime = System.nanoTime();
        arrayList.get(9000);
        long arrayEndTime = System.nanoTime();
        long arrayGetTime = TimeUnit.MICROSECONDS.convert((arrayEndTime - arrayStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from arrayList: " + arrayGetTime);
        return arrayGetTime;
    }

    static long timeOfGettingNumberLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long linkedStartTime = System.nanoTime();
        linkedList.get(9000);
        long linkedEndTime = System.nanoTime();
        long linkedGetTime = TimeUnit.MICROSECONDS.convert((linkedEndTime - linkedStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from LinkedList: " + linkedGetTime);
        return linkedGetTime;
    }

    static long timeOfGettingNumberFromHashMap() {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++) {
            hashMap.put(i, i);
        }
        long hashMapStartTime = System.nanoTime();
        hashMap.get(9000);
        long hashMapEndTime = System.nanoTime();
        long hashMapGetTime = TimeUnit.MICROSECONDS.convert((hashMapEndTime - hashMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from HashMap: " + hashMapGetTime);
        return hashMapGetTime;
    }

    static long timeOfGettingNumberFromTreeMap() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++) {
            treeMap.put(i, i);
        }
        long treeMapStartTime = System.nanoTime();
        treeMap.get(9000);
        long treeMapEndTime = System.nanoTime();
        long treeMapGetTime = TimeUnit.MICROSECONDS.convert((treeMapEndTime - treeMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from TreeMap: " + treeMapGetTime);
        return treeMapGetTime;
    }


    static long timeOfRemoveNumberFromArray() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 10000; i++) {
            arrayList.add(i);
        }
        long arrayStartTime = System.nanoTime();
        arrayList.remove(9900);
        long arrayEndTime = System.nanoTime();
        long arrayGetTime = TimeUnit.MICROSECONDS.convert((arrayEndTime - arrayStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from arrayList: " + arrayGetTime);
        return arrayGetTime;
    }

    static long timeOfRemoveNumberLinkedList() {
        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        for (int i = 0; i < 100000; i++) {
            linkedList.add(i);
        }
        long linkedStartTime = System.nanoTime();
        linkedList.remove(9900);
        long linkedEndTime = System.nanoTime();
        long linkedGetTime = TimeUnit.MICROSECONDS.convert((linkedEndTime - linkedStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from LinkedList: " + linkedGetTime);
        return linkedGetTime;
    }

    static long timeOfRemoveNumberFromTreeSet() {
        TreeSet<Integer> treeSet = new TreeSet<Integer>();
        for (int i = 0; i < 100000; i++) {
            treeSet.add(i);
        }
        long treeSetStartTime = System.nanoTime();
        treeSet.remove(9900);
        long treeSetEndTime = System.nanoTime();
        long treeSetExeTime = TimeUnit.MICROSECONDS.convert((treeSetEndTime - treeSetStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from TreeSet: " + treeSetExeTime);
        return treeSetExeTime;
    }

    static long timeOfRemoveNumberFromHashSet() {
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (int i = 0; i < 100000; i++) {
            hashSet.add(i);
        }
        long hashSetStartTime = System.nanoTime();
        hashSet.remove(9900);
        long hashSetEndTime = System.nanoTime();
        long hashSetExeTime = TimeUnit.MICROSECONDS.convert((hashSetEndTime - hashSetStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from HashSet: " + hashSetExeTime);
        return hashSetExeTime;
    }

    static long timeOfRemoveNumberFromHashMap() {
        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++) {
            hashMap.put(i, i);
        }
        long hashMapStartTime = System.nanoTime();
        hashMap.remove(9900);
        long hashMapEndTime = System.nanoTime();
        long hashMapGetTime = TimeUnit.MICROSECONDS.convert((hashMapEndTime - hashMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from HashMap: " + hashMapGetTime);
        return hashMapGetTime;
    }

    static long timeOfRemoveNumberFromTreeMap() {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < 100000; i++) {
            treeMap.put(i, i);
        }
        long treeMapStartTime = System.nanoTime();
        treeMap.remove(9900);
        long treeMapEndTime = System.nanoTime();
        long treeMapGetTime = TimeUnit.MICROSECONDS.convert((treeMapEndTime - treeMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from TreeMap: " + treeMapGetTime);
        return treeMapGetTime;
    }


}
