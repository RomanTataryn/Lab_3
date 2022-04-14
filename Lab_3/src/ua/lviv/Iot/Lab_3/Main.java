package ua.lviv.Iot.Lab_3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Truck Truck1 = new Truck("Scania", "s400", "truck",
                Standart.EURO_6, "disel", 2020, 50000, 6.4);
        Truck Truck2 = new Truck("Mercedec", "Actros", "truck",
                Standart.EURO_6, "disel", 2019, 45000, 6.0);
        Truck Truck3 = new Truck("Volvo", "FH", "truck",
                Standart.EURO_6, "disel", 2018, 55000, 6.2);
        Bus Bus1 = new Bus("Mercedec", "Sprinter", "bus",
                Standart.EURO_5, "disel", 2021, 25000, 3.4);
//        Bus Bus2 = new Bus("Volkswagen", "Crafter", "bus",
//                Standart.EURO_5, "disel", 2020, 20000, 3.0);
//        Bus Bus3 = new Bus("Renault", "Master", "bus",
//                Standart.EURO_5, "disel", 2019, 18000, 3.2);
//        Minivan Minivan1 = new Minivan("Mercedec", "Vito", "minivan",
//                Standart.EURO_5, "petrol", 2020, 25000, 2.0);
//        Minivan Minivan2 = new Minivan("Volkswagen", "Transporter", "minivan",
//                Standart.EURO_6, "petrol", 2021, 20000, 2.0);
//        Minivan Minivan3 = new Minivan("Renault", "Trafic", "minivan",
//                Standart.EURO_5, "petrol", 2018, 15000, 2.4);
//        Auto Auto1 = new Auto("Mercedec", "amg", "auto",
//                "euro-6", "petrol", 2020, 20000, 2.0);
//        Auto Auto2 = new Auto("Bmw", "m5", "auto",
//                "euro-6", "petrol", 2021, 25000, 2.2);
//        Auto Auto3 = new Auto("Volkswagen", "jetta", "auto",
//                "euro-6", "petrol", 2016, 15000, 1.9);
//        System.out.println("Used Cars:");
//        System.out.println(Truck1.toString());
//        System.out.println(Truck2.toString());
//        System.out.println(Truck3.toString());
//        System.out.println(Bus1.toString());
//        System.out.println(Bus2.toString());
//        System.out.println(Bus3.toString());
//        System.out.println(Minivan1.toString());
//        System.out.println(Minivan2.toString());
//        System.out.println(Minivan3.toString());
//        System.out.println(Auto1.toString());
//        System.out.println(Auto2.toString());
//        System.out.println(Auto3.toString());
//        System.out.println("Sorted price:");
//
     ArrayList<Car> UsedCars = new ArrayList<>();
        UsedCars.add(Truck1);
        UsedCars.add(Truck2);
        UsedCars.add(Truck3);
        UsedCars.add(Bus1);
//        UsedCars.add(Bus2);
//        UsedCars.add(Bus3);
//        UsedCars.add(Minivan1);
//        UsedCars.add(Minivan2);
//        UsedCars.add(Minivan3);
//        UsedCars.add(Auto1);
//        UsedCars.add(Auto2);
//        UsedCars.add(Auto3);
//        PriceComparator myPriceComparator = new PriceComparator();
//        UsedCars.sort(myPriceComparator);
//
//        System.out.println("Sorted price: ");
//        for (Car h: UsedCars) {
//            System.out.println(h);
//        }
//
//        UsedCars.sort(myPriceComparator);
//
//        System.out.println("Sorted price2: ");
//        for (Car h: UsedCars) {
//            System.out.println(h);
//        }
//
//        YearComparator myYearComparator = new YearComparator();
//        UsedCars.sort(myYearComparator);
//
//        System.out.println("Sorted year: ");
//        for (Car h: UsedCars) {
//            System.out.println(h);
//        }
        System.out.println("------------------------------------------------------------- ");
Comparators myComparator = new Comparators();
        myComparator.sortByPricetAsc(UsedCars);
        System.out.println("------------------------------------------------------------- ");
        myComparator.sortByPricetDesc(UsedCars);
        System.out.println("------------------------------------------------------------- ");
        myComparator.sortByYeartAsc(UsedCars);
        System.out.println("------------------------------------------------------------- ");
        myComparator.sortByYeartDesc(UsedCars);

}
}