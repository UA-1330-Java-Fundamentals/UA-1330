package Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class CommonElementsFinderStarter {

    public static List<Integer> findCommonElements(List<Integer> list1, List<Integer> list2) {
        List<Integer> commonElements = new ArrayList<>();
        if (list1 == null || list2 == null || list1.isEmpty() || list2.isEmpty()){
            return commonElements;
        }
        for (Integer element : list1) {
            if (element != null && list2.contains(element) && !commonElements.contains(element)) {
                commonElements.add(element);
            }
        }
        return new ArrayList<>(commonElements);
    }

    public static Integer findMaxValue(List<Integer> commonElements) {
        if (commonElements == null || commonElements.isEmpty()) {
            return null;
        }

        int maxValue = Collections.max(commonElements);
        return maxValue;
    }
}