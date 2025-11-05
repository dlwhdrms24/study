package school.sec04;

import java.util.*;

public class SearchDemo {
    public static void main(String[] args) {
        String[] s = {"황금을", "돌", "같이", "보라"};
        List<String> list = Arrays.asList(s);

        Collections.sort(list);
        System.out.println(list);
        int i = Collections.binarySearch(list,"같이");
        System.out.println(i);
    }
}
