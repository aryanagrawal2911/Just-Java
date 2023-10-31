public class MAX_INDEX_Distance_large_small_number {

	static int IndexMaxDiff(int arr[]) {
		int n = arr.length;
		int maxDiff = -1;
		int j;

		for (int i = 0; i < n; i++) {
			j = n - 1;
			while (j > i) {
				if (arr[j] > arr[i])
					maxDiff = Math.max(maxDiff, j - i);
				j--;
			}
		}
		return maxDiff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 2, 5, 7, 9, 0, 1, 6, 9 };
		System.out.println(IndexMaxDiff(arr));
	}

}
