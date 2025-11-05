package school.ex.ex3.ch;

import java.util.*;

public class Chapter11_4 {
    public static void main(String[] args) {
        List<HashMap<String,String>> list = new ArrayList<>();
        HashMap<String,String> map;

        map = new HashMap<>();
        map.put("eng","boy");
        map.put("han","머스마");
        list.add(map);

        map = new HashMap<>();
        map.put("eng","girl");
        map.put("han","가시나");
        list.add(map);

        list.forEach(m -> System.out.println(m.get("eng") +" = " + m.get("han")));
    }
}
