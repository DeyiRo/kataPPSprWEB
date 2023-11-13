package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class CarServiceImpl implements CarService {
    private List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Lada", "white"));
        carList.add(new Car(2, "Opel", "red"));
        carList.add(new Car(3, "Skoda", "green"));
        carList.add(new Car(4, "Nissan", "blue"));
        carList.add(new Car(5, "KIA", "black"));

        System.out.println(Arrays.toString(carList.toArray()));

    }

    @Override
    public List<Car> getCarList(int count) {
        List<Car> result;
        if (count < carList.size()) {
            result = carList.subList(0, count);
        } else {
            result = carList;
        }
        return result;
    }
}
