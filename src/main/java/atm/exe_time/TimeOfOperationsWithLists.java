package atm.exe_time;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class TimeOfOperationsWithLists {
    static ArrayList<Integer> array = new ArrayList<Integer>();
    static LinkedList<Integer> linkedList = new LinkedList<Integer>();
    static HashSet<Integer> hashSet = new HashSet<Integer>();
    static TreeSet<Integer> treeSet = new TreeSet<Integer>();
    static HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();
    static TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();

    public static long calculateExeTimeForArrayListAdding() {
        long arrayStartTime = System.nanoTime();
        for (int i = 0; i < 10000; i++) {
            array.add(i);
        }
        long arrayEndTime = System.nanoTime();
        long arrayExeTime = TimeUnit.MICROSECONDS.convert((arrayEndTime - arrayStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for adding elements into array: " + arrayExeTime);
        return arrayExeTime;
    }

    static long calculateExeTimeForLinkedListAdding() {
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
        long arrayStartTime = System.nanoTime();
        array.get(9000);
        long arrayEndTime = System.nanoTime();
        long arrayGetTime = TimeUnit.MICROSECONDS.convert((arrayEndTime - arrayStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from array: " + arrayGetTime);
        return arrayGetTime;
    }

    static long timeOfGettingNumberLinkedList() {
        long linkedStartTime = System.nanoTime();
        linkedList.get(9000);
        long linkedEndTime = System.nanoTime();
        long linkedGetTime = TimeUnit.MICROSECONDS.convert((linkedEndTime - linkedStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from LinkedList: " + linkedGetTime);
        return linkedGetTime;
    }
    //
////    static void getNumberFromHashSet() {
////        Iterator iterator = hashSet.iterator();
////         iterator.next();
////    }
//
//    static long getNumberFromTreeSet() {
//        return
//    }

    static long timeOfGettingNumberFromHashMap() {
        long hashMapStartTime = System.nanoTime();
        hashMap.get(9000);
        long hashMapEndTime = System.nanoTime();
        long hashMapGetTime = TimeUnit.MICROSECONDS.convert((hashMapEndTime - hashMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from HashMap: " + hashMapGetTime);
        return hashMapGetTime;
    }

    static long timeOfGettingNumberFromTreeMap() {
        long treeMapStartTime = System.nanoTime();
        treeMap.get(9000);
        long treeMapEndTime = System.nanoTime();
        long treeMapGetTime = TimeUnit.MICROSECONDS.convert((treeMapEndTime - treeMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for getting element from TreeMap: " + treeMapGetTime);
        return treeMapGetTime;
    }


    static long timeOfRemoveNumberFromArray() {
        long arrayStartTime = System.nanoTime();
        array.remove(9900);
        long arrayEndTime = System.nanoTime();
        long arrayGetTime = TimeUnit.MICROSECONDS.convert((arrayEndTime - arrayStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from array: " + arrayGetTime);
        return arrayGetTime;
    }

    static long timeOfRemoveNumberLinkedList() {
        long linkedStartTime = System.nanoTime();
        linkedList.remove(9900);
        long linkedEndTime = System.nanoTime();
        long linkedGetTime = TimeUnit.MICROSECONDS.convert((linkedEndTime - linkedStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from LinkedList: " + linkedGetTime);
        return linkedGetTime;
    }

    static long timeOfRemoveNumberFromHashMap() {
        long hashMapStartTime = System.nanoTime();
        hashMap.remove(9900);
        long hashMapEndTime = System.nanoTime();
        long hashMapGetTime = TimeUnit.MICROSECONDS.convert((hashMapEndTime - hashMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from HashMap: " + hashMapGetTime);
        return hashMapGetTime;
    }

    static long timeOfRemoveNumberFromTreeMap() {
        long treeMapStartTime = System.nanoTime();
        treeMap.remove(9900);
        long treeMapEndTime = System.nanoTime();
        long treeMapGetTime = TimeUnit.MICROSECONDS.convert((treeMapEndTime - treeMapStartTime), TimeUnit.NANOSECONDS);
        System.out.println("Time for remove element from TreeMap: " + treeMapGetTime);
        return treeMapGetTime;
    }


}
