public class array_Linear_Search {

	static int LinearSearch(int arr[], int x) {

		int re = -1;

		for (int i : arr) {

			if (i == x)
				re = i;
		}
		return re;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
