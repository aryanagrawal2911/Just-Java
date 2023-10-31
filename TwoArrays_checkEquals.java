import java.util.Arrays;

public class TwoArrays_checkEquals {
	static boolean checkEquals(char A[], char B[]) {
		boolean b = false;

		Arrays.sort(A);
		Arrays.sort(B);

		if (A.length == B.length)

			for (int i = 0; i < A.length; i++)
				if (A[i] == B[i])
					b = true;

		return b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char arrA[] = { '1', '2', '2', '3', '3', '3', '4', '4', '4', '4', '5', '5', '5', '5', '5' };
		char arrB[] = { '2', '1', '3', '5', '4', '2', '3', '4', '5', '3', '5', '4', '5', '4', '5' };
		System.out.println(checkEquals(arrA, arrB));

	}

}
