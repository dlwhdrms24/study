package school.sec04;

import java.util.*;

public class ShuffleDemo {
    public static void main(String[] args) {
        List<Character> list = new ArrayList<>();

        for (char c = 'A'; c <= 'G'; c++){
            list.add(c);
        }
        System.out.println("최초리스트 : " + list);
        Collections.rotate(list,3);
        System.out.println("돌린리스트 : " + list);
        Collections.shuffle(list);
        System.out.println("섞은리스트 : " + list);

    }

}
