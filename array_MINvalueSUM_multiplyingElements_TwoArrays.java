import java.util.Arrays;

public class array_MINvalueSUM_multiplyingElements_TwoArrays {
	static int minValue(int A[], int B[]) {
		int n = A.length;
		Arrays.sort(A);
		Arrays.sort(B);
		int re = 0;

		for (int i = 0; i < n; i++)
			re += A[i] * B[n - i - 1];

		return re;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 5, 3, 8, 2, 7, 4, 9 };
		int brr[] = { 4, 5, 6, 8, 3, 7, 1 };
		System.out.println(minValue(arr, brr));
	}

}
