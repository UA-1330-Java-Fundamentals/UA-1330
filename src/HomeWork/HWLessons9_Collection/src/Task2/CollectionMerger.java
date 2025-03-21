package Task2;

import java.util.*;

class CollectionMerger {

    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {
        if (list1 == null) list1 = new ArrayList<>();
        if (list2 == null) list2 = new ArrayList<>();
        List<String> list3 = new LinkedList<String>();
        list3.addAll(0, list1);
        list3.addAll(0, list2);
        Collections.sort(list3);
        Set<String> set = new LinkedHashSet<>(list3);
        list3 = new ArrayList<>(set);
        ArrayList<String> arrayList1 = new ArrayList<>(list3);
        return new ArrayList<String>(arrayList1);
    }

    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("apple", "banana");
        List<String> list2 = Arrays.asList("banana", "cherry");
        mergeAndSortLists(list1, list2);
        //System.out.println(mergeAndSortLists(list1, list2));


    }
}