package school.ex.ex3.ch;

import java.util.*;

public class Chapter11_2 {
    public static void main(String[] args) {
        Map<String,String>dic = new HashMap<>();
        dic.put("head","대가빠리");
        dic.put("teacher","쌤");
        dic.put("cat","꼬네이");
        dic.put("aunt","아지매");
        dic.put("noodle","국시");
        dic.put("child","얼라");

//        for (String key : dic.keySet()) {
//            System.out.printf("%s=%s ",key,dic.get(key));
//        }

//        dic.forEach((k,v) ->  System.out.print(STR."\{k}=\{v} "));
        dic.forEach((k,v) ->  System.out.print(k + "=" + v + " "));
        System.out.println();

        Collection<String> collection1 = dic.values();

        List<String> list = new ArrayList<>(collection1);
        Collections.shuffle(list);
        list.forEach(x -> System.out.print(x + " "));
    }
}
