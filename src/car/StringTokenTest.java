package car;

import java.util.StringTokenizer;
import java.util.Date;

public class StringTokenTest {
    public static void main(String[] args) {
        Car car = new Car("그랜저", new Date(), "홍길동");
        String carInfo = car.toString();

        StringTokenizer st = new StringTokenizer(carInfo, " ,[]()=");

        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}
