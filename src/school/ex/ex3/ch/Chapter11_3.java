package school.ex.ex3.ch;

import java.util.*;

public class Chapter11_3 {
    public static void main(String[] args) {
        //문제 4
        String[] s = {"사과", "바나나"};
        List<String> list = Arrays.asList(s);

//        list.add("컵케익");
        list.forEach(v -> System.out.print(v + " "));
        System.out.println();
        // UnsupportedOperationException Create breakpoint
        //수정이 불가능한(읽기 전용) add()나 remove() 같은 '수정' 명령을 내릴때
        //즉 asList 로만든건 고정된 크기를 가진다(읽기O,크기변경 X)

        //문제 5
        Map<String,Integer> v = new HashMap<>();

        //문제6
        Stack<Integer> si = new Stack<>();
        si.add(10);
        si.add(20);
        si.add(1,100);
        si.forEach(c -> System.out.println(c + " "));

        //문제7 반복자 패턴 Iterator
        List<String> presidents = List.of("이승만", "박정희", "전두환");
        Iterator<String> iterator = presidents.iterator();
        while(iterator.hasNext())
            System.out.println(iterator.next());
     }
}
