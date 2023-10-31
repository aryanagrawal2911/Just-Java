
public class array_SelectionSort {

	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void sort(int arr[]) {
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {

				int min = Math.min(arr[i], arr[j]);

				if (min == arr[j])
					swap(arr, i, j);

			}
			for (int k = 0; k < arr.length; k++)
				System.out.print(arr[k] + "\t");
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 53, 2, 6, 764, 523, 57, 45, 6 };
		sort(arr);

		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + "\t");
	}

}
