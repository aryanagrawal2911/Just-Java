import java.util.Scanner;
import java.util.LinkedHashSet;

class basic_LinkedHashSet {
    static Scanner sn = new Scanner(System.in);

    static void display(LinkedHashSet<Double> lhs) {
        System.out.println(lhs);
    }

    static void insert(LinkedHashSet<Double> lhs) {
        System.out.println("Enter Double : ");
        double d = sn.nextDouble();
        lhs.add(d);
    }
}