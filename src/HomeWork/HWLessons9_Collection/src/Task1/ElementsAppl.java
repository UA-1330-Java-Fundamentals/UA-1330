package Task1;

import java.util.List;

public class ElementsAppl {
    public static void main(String[] args) {
        List<Integer> list1 = List.of(5, 5, 5);
        //List<Integer> list1 = List.of();
        List<Integer> list2 = List.of(2, 3, 4, 5, 9);

        List<Integer> commonElements = CommonElementsFinderStarter.findCommonElements(list1, list2);
        if (commonElements == null || commonElements.isEmpty()) {
            System.out.println("No common elements");
        } else {
            System.out.println("Common elements: " + commonElements);
        }

        Integer maxValue = CommonElementsFinderStarter.findMaxValue(commonElements);
        if (maxValue != null) {
            System.out.println("Maximum value among common elements: " + maxValue);
        } else {
            System.out.println("No common elements to determine the maximum value " + maxValue);
        }
    }

}

