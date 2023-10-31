import java.util.HashSet;
import java.util.Scanner;

public class HASHSET_basic {

	static Scanner sn = new Scanner(System.in);
	static HashSet<Integer> hs = new HashSet<>();

	static void Input(int n) {
		int i = 1;
		System.out.println("Enter the elements to be inserted : ");
		while (i <= n) {
			hs.add(sn.nextInt());
			i++;
		}
	}

	static void display() {
		System.out.println(hs);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Input(7);
		display();
	}

}
