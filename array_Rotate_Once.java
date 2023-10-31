public class array_Rotate_Once {

	static void RotateOnce(int arr[]) {

		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + ", ");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		RotateOnce(arr);

	}

}
