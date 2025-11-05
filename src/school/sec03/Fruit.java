package school.sec03;

import java.util.Objects;

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

    public String toString() {
        return String.format("Fruit(%s)", name);
    }
}