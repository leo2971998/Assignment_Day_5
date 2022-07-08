package SubClasses;

import java.util.Comparator;

public class TypeComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1.getType().compareTo(o2.getType()) > 0 ) {
            return 1;
        }
        else if (o1.getType().compareTo(o2.getType()) < 0) {
            return -1;
        }
        else return 0;
    }
}
