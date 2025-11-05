package school.sec02;

import java.util.*;

public class HashSet2Demo {
    public static void main(String[] args) {
        Set<Fruit> fruits = new HashSet<>();
        fruits.add(new Fruit("사과"));
        fruits.add(new Fruit("사과"));
        System.out.println(fruits.size());
        System.out.println(fruits);
    }
}

class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(name, fruit.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String toString(){
        return String.format("Fruit(%s)",name);
    }
}
