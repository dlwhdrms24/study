package school.car;

import java.util.StringTokenizer;
import java.util.Date;

public class StringTokenTest {
    public static void main(String[] args) {
        // 1. 문제 02에서 만든 것과 동일한 형식의 문자열 준비
        Car car = new Car("그랜저", new Date(), "홍길동");
        String carInfo = car.toString();


        // 2. 구분자로 사용할 문자들을 지정: " ,[]()="
        StringTokenizer st = new StringTokenizer(carInfo, " ,[]()=");

        // 3. 토큰이 없을 때까지 반복하며 하나씩 출z력
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
    }
}