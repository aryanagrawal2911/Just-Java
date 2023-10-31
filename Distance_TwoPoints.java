import java.util.Scanner;

class Point {
	float x, y;

	void setPoint(float x1, float y1) {
		x = x1;
		y = y1;
	}

	void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}

	double findDistance(Point p) {
		double f = Math.sqrt((Math.pow((p.x - x), 2)) + (Math.pow((p.y - y), 2)));
		return f;
	}
}

class Distance_TwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		Point a = new Point();
		System.out.println("Enter the coordinates for point 1:");

		float k = in.nextFloat();
		float l = in.nextFloat();
		a.setPoint(k, l);

		System.out.print("Point 1 is:");
		a.showPoint();

		Point b = new Point();
		System.out.println("Enter the coordinates for point 2:");

		int k1 = in.nextInt();
		int l1 = in.nextInt();
		b.setPoint(k1, l1);

		System.out.print("Point 2 is:");
		b.showPoint();

		double d = a.findDistance(b);
		System.out.print("Distance between point 1 and point 2 is approximately: " + d);
		in.close();

	}

}
