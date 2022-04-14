package ua.lviv.Iot.Lab_3.manager;

import ua.lviv.Iot.Lab_3.model.Car;

import java.util.Comparator;

public class YearComparator<C> implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

        if (o1.getYearOfManufacture()== o2.getYearOfManufacture()) {
            return 0;
        }
        if (o1.getYearOfManufacture() > o2.getYearOfManufacture()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}