package school.ex.ex3.ch;

import java.util.*;

public class Chapter11_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("갈매기");
        list.add("나비");
        list.add("다람쥐");
        list.add("라마");
        list.forEach(v-> {
            if (2 == v.length()) {
                System.out.print(v + " ");
            }
        });

    }
}
