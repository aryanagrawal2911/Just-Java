
public class array_BubbleSort_Demo {

	static void swap(int arr[], int a, int b) {
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	static void BubbleSort(int arr[]) {

		int flag = 0;
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {

			for (int j = 0; j < n - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					swap(arr, j, j + 1);
					flag = 1;
				}
			}

			if (flag == 0)
				break;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 53, 2, 6, 764, 523, 57, 45, 6 };
		BubbleSort(arr);

		for (int i : arr)
			System.out.print(i + "\t");
	}

}
