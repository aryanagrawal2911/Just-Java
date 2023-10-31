import java.util.Scanner;
import java.util.HashSet;

class basic_HASHSET {
    static Scanner sn = new Scanner(System.in);

    static void display(HashSet<String> hs) {
        System.out.println(hs);
    }

    static void insert(HashSet<String> hs) {
        System.out.println("Enter String : ");
        String str = sn.next();
        hs.add(str);
    }
}