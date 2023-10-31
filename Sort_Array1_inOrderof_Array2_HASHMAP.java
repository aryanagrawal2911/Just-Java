import java.util.*;

public class Sort_Array1_inOrderof_Array2_HASHMAP {
    static void sortabyb(int arr[], int brr[]) {
        int a = arr.length;
        int b = brr.length;
        int value;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < a; i++) {
            if (hm.containsKey(arr[i])) {
                value = hm.get(arr[i]);
                hm.put(arr[i], value + 1);
            } else
                hm.put(arr[i], 1);
        }

        for (int i = 0; i < b; i++) {
            if (hm.containsKey(brr[i])) {
                value = hm.get(brr[i]);

                for (int j = 0; j < value; j++) {
                    System.out.print(brr[i] + "\t");
                }

                hm.remove(brr[i]);
            }
        }

        for (int i = 0; i < a; i++) {
            if (hm.containsKey(arr[i])) {
                value = hm.get(arr[i]);

                for (int j = 0; j < value; j++) {
                    System.out.print(arr[i] + "\t");
                }

                hm.remove(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 2, 5, 7, 1, 9, 3, 6, 8, 8 };
        int brr[] = { 2, 1, 8, 3 };
        sortabyb(arr, brr);
    }
}
