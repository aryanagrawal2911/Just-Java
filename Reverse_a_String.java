// Java program to illustrate the
// java.lang.StringBuffer.reverse()
public class Reverse_a_String {

	public static void main(String args[]) {

		StringBuffer sbf = new StringBuffer("This is a string");
		System.out.println("String buffer = " + sbf);

		sbf.reverse();
		System.out.println("String buffer after reversing = " + sbf);
	}
}
