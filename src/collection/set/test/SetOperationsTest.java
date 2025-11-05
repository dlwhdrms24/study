package collection.set.test;

import java.util.*;
public class SetOperationsTest {

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> hapset = new HashSet<>();
        hapset.addAll(set1);
        hapset.addAll(set2);
        System.out.println("합집합: " + hapset); //union

        Set<Integer> gyoset = new HashSet<>(set1);
        gyoset.retainAll(set2);
        System.out.println("교집합: "+ gyoset); //intersection

        Set<Integer> cset = new HashSet<>(set1); //difference
        cset.removeAll(set2);
        System.out.println("차집합: " + cset);
    }
}
