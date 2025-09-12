package generic.ex3;


public class AnimalHospitalV2 <T> {
    //여기서 Animal 밑에있는 자식들만 들어올수있게 만들수있다면 문제가 안생길거다 이거를 어떤방식으로 자바에서 해결하고있는가
    // 타입매개변수 제안이라는 방법을 사용함
    private T animal;

    public void set(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        //T의 타입을 메서드를 정의하는 시점에는 알 수 없다. Object의 기능만 사용
        animal.toString();
        animal.equals(null);
    }
        public T bigger(T target){
//        return animal.getSize() > target.getSize() ? animal : target;
            return null;
    }
}



