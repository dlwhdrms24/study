package school.ex.ex3.ch;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Chapter11_10 {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "a", "b", "c"};
        String[] s2 = {"c"};
        HashSet<String> set1 = new HashSet<>(Arrays.asList(s1));
        HashSet<String> set2 = new HashSet<>(Arrays.asList(s2));
        System.out.println("set1: " + set1);
        System.out.println("set2: " + set2);
        System.out.println("set1과 set2는 같다 : " + set1.equals(set2));
        System.out.println("set1과 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2));
        Set<String> union = new HashSet<>(set1);
        union.addAll(set2);
        System.out.println("합집합 : " + union);
        Set<String> intersection = new HashSet<>(set1);
        intersection.retainAll(set2);
        System.out.println("교집합 : " + intersection);

    }
}
