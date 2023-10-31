import java.util.Scanner;
import java.util.TreeMap;

class Address {
    int plot;
    String at;
    String post;

    Address(int plot, String at, String post) {
        this.plot = plot;
        this.post = post;
        this.at = at;
    }
}

public class basic_data_TREEMAP {
    static Scanner sn = new Scanner(System.in);

    static void display(TreeMap<String, Address> tm) {
        System.out.println(tm);
    }

    static void insert(TreeMap<String, Address> tm) {
        System.out.println("Enter name : ");
        String name = sn.next();

        System.out.println("Enter address details : ");
        int p = sn.nextInt();
        String a = sn.next();
        String po = sn.next();

        Address Add = new Address(p, a, po);
        tm.put(name, Add);
    }
}
