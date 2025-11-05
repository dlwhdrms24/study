package school.ex.ex3.ch;

import java.util.*;
import java.io.*;

public class Chapter11_6 {
    public static void main(String[] args) throws IOException{
        Map<String,Integer> map = new Hashtable<>();
        map.put("김열공",80);
        map.put("최고봉",90);
        map.put("우등생",95);
        map.put("나자바",88);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("이름을 입력하세요 : ");
        String n = br.readLine();

        if (map.containsKey(n)){
            System.out.println(map.get(n));
        }else {
            System.out.println("해당하는 사람이 없습니다.");
        }


    }
}
