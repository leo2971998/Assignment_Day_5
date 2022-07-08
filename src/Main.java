import SubClasses.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Collections;
public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<Vehicle> Ve = new ArrayList<Vehicle>();
        File file = new File("Testcase.txt");
        Scanner sc = new Scanner(file);
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Registration No\t\tName\tType\t\t   Weight");
        for (int i = 0; i < n; i++) {
            Ve.add(Vehicle.CreateVehicle(sc.nextLine()));
            System.out.println(Ve.get(i).Display());
        }
        System.out.println("Enter a type of sorting: ");
        System.out.println("1. Sort by weight");
        System.out.println("2. Sort by type");
        Scanner sc1 = new Scanner(System.in);
        int type = sc1.nextInt();
        switch (type) {
            case 1:
                Collections.sort(Ve, new WeightComparator());
                System.out.println("Registration No\t\tName\tType\t\t   Weight");
                for (int i = 0; i < Ve.size(); i++) {
                    System.out.println(Ve.get(i).Display());
                }
                break;
            case 2:
                Collections.sort(Ve, new TypeComparator());
                System.out.println("Registration No\t\tName\tType\t\t   Weight");
                for (int i = 0; i < Ve.size(); i++) {
                    System.out.println(Ve.get(i).Display());
                }
                break;
            default:
                System.out.println("Invalid Choice.");
                break;
            }
        }
    }