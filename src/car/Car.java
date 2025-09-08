package car;


import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Objects;
import java.util.Date;

public class Car {
    private String model;
    private  Date date;
    private String driver;

    public Car(String model,Date date, String driver) {
        this.model = model;
        this.date = date;
        this.driver = driver;
    }


    public String getModel() {
        return this.model;
    }
    @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return Objects.equals(model,car.model);
    }


    @Override
    public String toString() {
        String pattern = "날짜: {0}, 자동차 모델=[{1}], 운전자=({2})";
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy");
        String formattedDate = sdf.format(this.date);

        return MessageFormat.format(pattern, formattedDate, this.model, this.driver);
    }

}
