package SubClasses;
import java.util.Comparator;
import java.util.*;
public class Vehicle {
    private String registrationNo;
    private String name;
    private String type;
    private double weight;

    public Vehicle(String registrationNo, String name, String type, double weight) {
        this.registrationNo = registrationNo;
        this.name = name;
        this.type = type;
        this.weight = weight;
    }

    public String getRegistrationNo() {
        return registrationNo;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public double getWeight() {
        return weight;
    }

    public String Display() {
        return  this.registrationNo + "\t\t" +
                this.name + "\t" +
                this.type + "\t\t" +
                this.weight;
    }
    public static Vehicle CreateVehicle(String details) {
        String[] str = new String[4];
        str = details.split(",");
        Vehicle V = new Vehicle(str[0],str[1],str[2],Double.parseDouble(str[3]));
        return V;
    }

}
