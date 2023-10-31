public class array_Leaders {

	// The 'Leader' here refers to the greatest element in the array from right.

	static void leaders(int arr[]) {
		int n = arr.length;
		int l = 0;
		int pl = arr[n - 1];

		for (int i = n - 2; i >= 0; i--) {

			l = Math.max(pl, Math.max(l, arr[i]));

			if (pl != l)
				System.out.print(l + "  ");

			pl = l;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 3, 4, 5, 2 };
		leaders(arr);
	}

}
