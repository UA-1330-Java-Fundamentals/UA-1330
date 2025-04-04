package homework10;

import java.util.HashSet;
import java.util.Set;

/*
Develop parameterized methods union(Set set1, Set set2) and intersect(Set set1, Set
set2), realizing the operations of union and intersection of two sets. Test the operation
of these techniques on two pre-filled sets.
 */
public class Task1 {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2){
    Set<T> result = new HashSet<>(set1);
    result.addAll(set2);
    return result;
    }
    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2){
        Set<T> result = new HashSet<>(set1);
        result.retainAll(set2);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = Set.of(1,3,5,6);
        Set<Integer> set2 = Set.of(2,3,4,6);

        Set<Integer> unionResult = union(set1, set2);
        System.out.println("Result of union: " + set1 + " and " + set2 + " is " + unionResult);

        Set<Integer> intersectResult = intersect(set1, set2);
        System.out.println("Result of intersection: " + set1 + " and " + set2 + " is " + intersectResult);

    }

}
