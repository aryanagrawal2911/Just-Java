import java.util.Scanner;

public class Arrays_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// set of multiple objects
		int[] marks = { 100, 65, 78, 21, 77 };

		for (int i = 0; i < marks.length; i++) {
			System.out.print(i + "\t");
			System.out.println(marks[i]);
		}

		for (int i = marks.length - 1; i >= 0; i--) {
			System.out.print(i + "\t");
			System.out.println(marks[i]);
		}

		for (int i : marks) {
			System.out.print(i + "\t");
		}

		int[][] a = new int[2][3];
		a[0][0] = 101;
		a[0][1] = 102;
		a[0][2] = 103;
		a[1][0] = 201;
		a[1][1] = 202;
		a[1][2] = 203;

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
			}

		}

		// 1.
		float[] fl = { 5.78f, 67, 33.8f, 22, 90.9f };
		float f = 0;
		for (int i = 0; i < fl.length; i++) {
			f += fl[i];
		}
		System.out.println(f);

		// 2.
		Scanner sn = new Scanner(System.in);
		double n = sn.nextDouble();
		double[] ab = { 78, 69.887, 56.75, 76.83, 93.5, 63.42, 65.2 };
		for (int i = 0; i < ab.length; i++) {
			if (ab[i] != n) {
				continue;
			} else {
				System.out.println("location is : " + i);
				break;
			}
		}
		sn.close();

		// 3.
		double[] ac = { 78, 69.8, 56.75, 76.8, 93.5, 63.42, 65.2, 98.5 };
		double s = 0;
		for (int i = 0; i < ac.length; i++) {
			s += ac[i];
		}
		s /= a.length;
		System.out.println(s);

		// 4.
		double[][] m1 = new double[2][3];
		double[][] m2 = new double[2][3];

		for (int i = 0; i < m1.length; i++) {
			for (int j = 0; j < m1[i].length; j++) {
				m1[i][j] = sn.nextDouble();
				m2[i][j] = sn.nextDouble();
			}
		}
		sn.close();

		// 5. The system will swear at you if you execute this command
		String[] arr = { "u", " ", "k", "c", "u", "f" };
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
		// told you so

		// 6. , 7.
		int[] ar = { 76, 65, 78, 21, 77 };
		int max = 0;
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < ar.length; i++) {
			max = Math.max(ar[i], max);
			min = Math.min(ar[i], min);
		}
		System.out.println("Maximum = " + max);
		System.out.println("Minimum = " + min);

	}
}