package generic.ex4;

import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {
    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이",100);
        Cat cat = new Cat("냐옹이",100);

        AnimalMethod.<Dog>checkup(dog); // <Dog> 생략된거임 타입매개변수 추론
        AnimalMethod.checkup(cat);

        Dog targetDog = new Dog("큰 멍멍이",200);
        Dog bigger = AnimalMethod.bigger(dog, targetDog);
        System.out.println("bigger = " + bigger);
    }
}
