import java.util.ArrayList;
import java.util.Collections;  // Import the Collections class

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
        System.out.println();

        Collections.sort(cars);  // triedenie aut

        for (String i : cars) {
            System.out.println(i);
        }
    }
} 