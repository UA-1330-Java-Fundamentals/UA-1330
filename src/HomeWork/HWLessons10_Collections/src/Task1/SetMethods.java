package Task1;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionsSet = new HashSet<>(set1);
        unionsSet.addAll(set2);
        return unionsSet;
    }

    public static <T> Set<T> intersect(Set<T> set1, Set<T> set2) {
        Set<T> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet<>();
        set1.add("january");
        set1.add("february");
        set1.add("march");
        set1.add("april");
        Set<String> set2 = new HashSet<>();
        set2.add("march");
        set2.add("april");
        set2.add("may");
        set2.add("june");

        System.out.println(set1);
        System.out.println(set2);
        System.out.println(union(set1, set2));
        System.out.println(intersect(set1, set2));

    }
}
