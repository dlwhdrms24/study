package school.ex.ex3.ch;

import java.util.HashMap;

public class Chapter11_9 {
    public static void main(String[] args) {
        HashMap<String,String> hashMap = new HashMap<>();
        hashMap.put("호랑이","tiger");
        hashMap.put("표범","leopard");
        hashMap.put("사자","lion");
        System.out.println("변경 전 : " + hashMap);
        hashMap.replaceAll((k,v) -> v.toUpperCase());
        System.out.println("변경 후 : " + hashMap);
    }
}
