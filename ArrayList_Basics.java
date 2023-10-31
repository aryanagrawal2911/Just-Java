import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Basics {
    static Scanner sn = new Scanner(System.in);

    static void display(ArrayList<Integer> arrl) {
        if (arrl.isEmpty())
            return;

        System.out.println("Array : " + arrl);
    }

    static boolean Search(ArrayList<Integer> arrl) {
        if (arrl.isEmpty())
            return false;

        System.out.println("Enter the value to be searched : ");
        int x = sn.nextInt();
        return arrl.contains(x);
    }

    static void remove(ArrayList<Integer> arrl, int index) {
        if (arrl.isEmpty())
            return;

        if (arrl.contains(arrl.get(index)))
            arrl.remove(index);

        else {
            System.out.println("Confirm Input Element");
            return;
        }

    }

}
