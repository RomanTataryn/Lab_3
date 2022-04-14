package ua.lviv.Iot.Lab_3;

import java.util.Comparator;

public class PriceComparator<C> implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {

            if (o1.getPrice() == o2.getPrice()) {
                return 0;
            }
            if (o1.getPrice() > o2.getPrice()) {
                return 1;
            }
            else {
                return -1;
            }
    }

    public int compare2(Car o1, Car o2) {

        if (o1.getPrice() == o2.getPrice()) {
            return 0;
        }
        if (o1.getPrice() < o2.getPrice()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}
