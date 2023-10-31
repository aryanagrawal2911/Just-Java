
public class array_check_Element_Frequency {
	static int checkFrequency(int arr[], int k) {
		int n = arr.length;
		int r = 0;
		for (int i = 0; i < n; i++) {
			int c = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] == arr[j])
					c++;
			}
			if (c >= k) {
				r = arr[i];
				break;
			}
		}
		return r;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ar[] = { 1, 2, 3, 2, 4, 5, 6, 7, 5, 6, 7, 4, 3, 4, 3, 4, 5, 5, 3, 4, 3, 3, 4, 3, 4, 3, 3, 4, 5 };
		System.out.println(checkFrequency(ar, 7));
	}

}
