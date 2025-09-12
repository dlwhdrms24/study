package school.car;

import java.util.Date;

public class CarTest {
    public static void main(String[] args) {

        Date today = new Date();
        Car myCar = new Car("그랜저",today,"홍길동");
        Car yourCar = new Car("그랜저",today,"홍길동");


        if (myCar.equals(yourCar)) {
            System.out.println("자동차 모델이 둘 다 [" + myCar.getModel() + "]로 동일하다.");
        } else {
            System.out.println("자동차 모델이 다르다.");
        }
    }
}
