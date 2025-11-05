package school.sec02;

import java.util.*;

public class TreeSetDemo{
    public static void main(String[] args) {
        Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
        HashSet<String> hashSet = new HashSet<>(set);
        System.out.println(hashSet);
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println(treeSet);

        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.lower("사과"));
        System.out.println(treeSet.higher("사과"));
    }
}
