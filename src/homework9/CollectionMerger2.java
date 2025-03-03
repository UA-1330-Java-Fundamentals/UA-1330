package homework9;

import java.util.*;

public class CollectionMerger2 {

    public static List<String> mergeAndSortLists(List<String> list1, List<String> list2) {

        if (list1 == null){
            list1 = new ArrayList<>();
        }
        if (list2 == null){
            list2 = new ArrayList<>();
        }


        Set<String> mergedList = new HashSet<>();

        mergedList.addAll(list1);
        mergedList.addAll(list2);

        List<String> sortedList = new ArrayList<>(mergedList);

        Collections.sort(sortedList);

        return sortedList; // Placeholder return statement
    }
}
