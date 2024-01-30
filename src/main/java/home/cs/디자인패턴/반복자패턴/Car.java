package home.cs.디자인패턴.반복자패턴;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.Date;

@Data
public class Car implements Comparable<Car>{

    private String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.getName());
    }
}
