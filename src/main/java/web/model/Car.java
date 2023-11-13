package web.model;

import org.springframework.stereotype.Component;

@Component
public class Car {
    private int number;
    private String model;
    private String color;

    public Car() {
    }

    public Car(int number, String model, String color) {
        this.number = number;
        this.model = model;
        this.color = color;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
