package atm.exe_time;

import static atm.exe_time.TimeOfOperationsWithLists.*;


public class Runner {
    public static void main(String[] args) {

        calculateExeTimeForArrayListAdding();
        calculateExeTimeForLinkedListAdding();
        calculateExeTimeForHashSetAdding();
        calculateExeTimeForTreeSetAdding();
        calculateExeTimeForHashMapAdding();
        calculateExeTimeForTreeMapAdding();
        timeOfGettingNumberFromArray();
        timeOfGettingNumberLinkedList();
        timeOfGettingNumberFromHashMap();
        timeOfGettingNumberFromTreeMap();
        timeOfRemoveNumberFromArray();
        timeOfRemoveNumberLinkedList();
        timeOfRemoveNumberFromHashMap();
        timeOfRemoveNumberFromTreeMap();

    }

}
