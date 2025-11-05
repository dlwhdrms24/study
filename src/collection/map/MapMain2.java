package collection.map;

import java.util.HashMap;
import java.util.Map;

public class MapMain2 {

    public static void main(String[] args) {
        HashMap<String, Integer> studentMap = new HashMap<>();

        studentMap.put("studentA", 90);
        System.out.println(studentMap);

        studentMap.put("studentA",100);//같은 키에 저장시 기존값 교체
        System.out.println(studentMap);

        boolean containsKey = studentMap.containsKey("studentA");

        //특정 값 삭제
        studentMap.remove("studentA");
        System.out.println(studentMap);
    }
}
