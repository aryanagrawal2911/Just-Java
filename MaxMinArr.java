
public class MaxMinArr {
	static void MaxMinArray(int arr[]) {
		int n = arr.length;
		int aux[] = new int[n];
		for (int i = 0; i < n; i++)
			aux[i] = arr[i];

		int start = 0;
		int end = n - 1;

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				arr[i] = aux[end];
				end--;
			} else {
				arr[i] = aux[start];
				start++;
			}
		}
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		MaxMinArray(arr);
	}

}
