package Comparable_Comparator;

import java.util.Comparator;

public class SortByComparator implements Comparator<Car> {

    @Override
    public int compare(Car c1, Car c2) {

        if (c1.getYear() > c2.getYear()) {
            return 1;
        } else if (c1.getYear() < c2.getYear()) {
            return -1;
        } else {
            return 0;
        }

    }

}
