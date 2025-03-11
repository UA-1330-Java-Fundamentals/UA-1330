/*
Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
set2), realizing the operations of union and intersection of two sets. Test the operation
of these techniques on two pre-filled sets.
*/

package HomeWorkFromPDF.HomeWorkFromPDF10;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class HomeWork1 {

    public static void union(Set<Integer> set1, Set<Integer> set2) {
        Set<Integer> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        System.out.println("unionSet: " + unionSet);
    }

    public static void intersect(Set<Integer> set1, Set<Integer> set2) {
//        Set<Integer> intersectSet = new HashSet<>();
//        for (Integer elem1 : set1){
//            for (Integer elem2 : set2){
//                if (elem1.equals(elem2)){
//                    intersectSet.add(elem2);
//                }
//            }
//        }
//        System.out.println(intersectSet);
        Set<Integer> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        System.out.println(intersectSet);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(2,3,4,5));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(4,6,4,2));

        union(set1, set2);
        intersect(set1, set2);
    }
}
