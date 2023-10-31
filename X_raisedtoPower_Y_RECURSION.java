
public class X_raisedtoPower_Y_RECURSION {

	static float xpowery(int x, int y) {
		if (y == 0)
			return 1;

		if (x == 0)
			return 0;

		if (y < 0)
			return 1 / (xpowery(x, (-1 * y)));

		return x * xpowery(x, y - 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(xpowery(2, 12));
	}

}
