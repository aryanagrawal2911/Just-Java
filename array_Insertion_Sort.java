
public class array_Insertion_Sort {

	static void sort(int arr[]) {
		int n = arr.length;

		for (int i = 1; i < n; i++) {

			int v = arr[i];
			int j = i - 1;

			while ((j >= 0) && (arr[j] > v)) {
				arr[j + 1] = arr[j];
				j--;
			}

			arr[j + 1] = v;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
