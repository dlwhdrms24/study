package school.ex.ex3.ch;

import java.util.*;

public class Chapter11_1 {
    public static void main(String[] args) {
        List<String> capitals = new ArrayList<>();
        capitals.add("서울");
        capitals.add("워싱턴");
        capitals.add("베이징");
        capitals.add("마드리드");
        capitals.add("파리");

        capitals.forEach((s)-> System.out.print(s + " "));
        System.out.println();
        capitals.add("런던");
        capitals.forEach((s)-> System.out.print(s + " "));
        System.out.println();

        capitals.removeIf(s ->  s.length() >= 3);
        capitals.forEach((s)-> System.out.print(s + " "));
        System.out.println();

    }
}
