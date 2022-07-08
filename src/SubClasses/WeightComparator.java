package SubClasses;
import java.util.Comparator;
public class WeightComparator implements Comparator<Vehicle> {

    @Override
    public int compare(Vehicle o1, Vehicle o2) {
        if (o1.getWeight() > o2.getWeight() ) {
            return 1;
        }
        else if (o1.getWeight() < o2.getWeight()) {
            return -1;
        }
        else return 0;
    }
}