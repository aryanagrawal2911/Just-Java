import java.util.Arrays;

public class Two_arrays_match_sum {

	static void twoArrays(int A[], int B[], int x) {

		int n = A.length;
		int m = B.length;
		Arrays.sort(A);
		for (int i = 0; i < n; i++)
			for (int j = 0; j < m; j++) {
				if ((A[i] + B[j]) == x) {
					System.out.println(A[i] + ", " + B[j]);
				}
			}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { -1, 2, 4, 1, 3 };
		int brr[] = { 10, 7, 8, 5, 6, 66, 33, 87 };
		twoArrays(arr, brr, 9);

	}

}
