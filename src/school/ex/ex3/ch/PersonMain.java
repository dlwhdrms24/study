package school.ex.ex3.ch;

import java.util.*;
public class PersonMain {
    public static void main(String[] args) {
        Set<Person> set = new HashSet<>();
        set.add(new Person("김열공", 20));
        set.add(new Person("최고봉", 56));
        set.add(new Person("우등생", 16));
        set.add(new Person("나자바", 35));

        set.forEach(n -> System.out.println(n.name + " : " + n.age));
        set.forEach(s-> System.out.print(s + " "));
    }
}
