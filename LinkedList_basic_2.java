import java.util.LinkedList;
import java.util.Scanner;

public class LinkedList_basic_2 {

	static Scanner sn = new Scanner(System.in);
	static LinkedList<Integer> ll = new LinkedList<>();

	static void swap(LinkedList<Integer> ll, int a, int b) {
		int temp = ll.get(a);
		ll.add(a, ll.get(b));
		ll.add(b, temp);
	}

	static void create(LinkedList<Integer> ll) {

		System.out.println("Total inputs : ");
		int n = sn.nextInt();

		System.out.println("Enter " + n + " elements : ");

		for (int i = 1; i <= n; i++) {
			int e = sn.nextInt();
			ll.add(e);
		}

		display(ll);
	}

	static void insert() {
		System.out.println("Insertion Enter the index : ");
		int i = sn.nextInt();
		System.out.println("Enter the element to insert : ");
		int e = sn.nextInt();

		ll.add(i, e);
		display(ll);
	}

	static void remove() {

		if (ll.isEmpty())
			return;

		System.out.println("Enter the element to remove : ");
		int e = sn.nextInt();

		if (!ll.contains(e))
			return;

		ll.remove(ll.indexOf(e));
		display(ll);
	}

	static void display(LinkedList<Integer> ll) {
		System.out.println("The list is : " + ll);
	}

	static void reverse(LinkedList<Integer> ll) {

		for (int i = ll.size() - 1; i >= 0; i--) {
			ll.add(ll.get(i));
			ll.remove(i);
		}
		System.out.println("Reversed List : " + ll);
	}

	static void sort(LinkedList<Integer> ll) {

		for (int i = 0; i < ll.size() - 1; i++)
			for (int j = 0; j < ll.size() - 1; j++) {

				if (ll.get(j) > ll.get(j + 1)) {
					swap(ll, j, j + 1);
					ll.remove(j + 1);
					ll.remove(j + 2);
				}
			}
		System.out.println("Sorted List : " + ll);
	}

	static void SortInsert(LinkedList<Integer> ll) {
		insert();
		sort(ll);
	}

	static void removeall(int e) {

		if (ll.isEmpty() || !ll.contains(e)) {
			display(ll);
			return;
		}

		ll.remove(ll.indexOf(e));
		removeall(e);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create(ll);
		insert();
		remove();
		reverse(ll);
		sort(ll);
	}

}
