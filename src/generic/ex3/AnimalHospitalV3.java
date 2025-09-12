package generic.ex3;


import generic.animal.Animal;

public class AnimalHospitalV3<T extends Animal> {
    //제네릭에 상속을하면 제한할수있음 받을수있는타입을 Animal과 자식만 받을수있도록
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 이름: " + animal.getName());
        System.out.println("동물 크기: " + animal.getSize());
        animal.sound();
    }
        public T bigger(T target){
        return animal.getSize() > target.getSize() ? animal : target;
    }
}



