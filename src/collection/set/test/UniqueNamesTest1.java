package collection.set.test;

import java.util.HashSet;
import java.util.Set;


public class UniqueNamesTest1 {

    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> hashset = new HashSet<>();
        for (Integer s : inputArr) {
            hashset.add(s);
        }

        hashset.forEach(System.out::println);
    }
}
