import java.util.Arrays;

public class array_Sequence_MIN_MAX_MIN {

	static void sequentiate(int arr[]) {
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 1; i <= n - 2; i += 2) {
			int temp = arr[i];
			arr[i] = arr[i + 1];
			arr[i + 1] = temp;
		}
	}

	public static void main(String[] args) {

		int A[] = { 1, 2, 3, 4, 5, 7, 76, 6, 34, 387, 67, 8, 769, 43, 456, 7211 };
		sequentiate(A);

		for (int i = 0; i < A.length; i++)
			System.out.print(A[i] + ", ");
	}

}
