package ua.lviv.Iot.Lab_3.manager;

import ua.lviv.Iot.Lab_3.model.Car;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Comparators {

    public List<Car> sortByPricetAsc (List<Car> list) {

        return list.stream()
                .sorted(Comparator.comparing(Car::getPrice))
               .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
                }
    public List<Car> sortByPricetDesc (List<Car> list) {
        return list.stream()
                .sorted(Comparator.comparing(Car::getPrice).reversed())
                .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
    }
    public List<Car> sortByYeartAsc (List<Car> list){
        return list.stream()
                .sorted(Comparator.comparing(Car::getYearOfManufacture))
                .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
    }
    public List<Car> sortByYeartDesc (List<Car> list){
        return list.stream()
                .sorted(Comparator.comparing(Car::getYearOfManufacture).reversed())
                .peek(x -> System.out.format("%s\n ", x))
                .collect(Collectors.toList());
    }
}
