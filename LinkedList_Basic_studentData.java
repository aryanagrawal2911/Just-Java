import java.util.LinkedList;
import java.util.Scanner;

class Student {
	String name;
	int age;
	float marks;

	Student(String name, int age, float marks) {
		this.name = name;
		this.age = age;
		this.marks = marks;
	}
}

public class LinkedList_Basic_studentData {

	static Scanner sn = new Scanner(System.in);

	static void display(LinkedList<Student> ll) {
		if (ll.isEmpty()) {
			System.out.println("LinkedList is EMPTY!!!");
			return;
		}
		System.out.println(ll);
	}

	static void inputStudent(LinkedList<Student> ll) {
		System.out.println("Enter Student details : ");
		String n = sn.next();
		int a = sn.nextInt();
		float m = sn.nextFloat();
		Student s = new Student(n, a, m);
		ll.add(s);
	}

	static void remove(LinkedList<Student> ll, Student s) {
		if ((ll.isEmpty()) || (ll.contains(s) == false)) {
			System.out.println("Input Student Unavailable");
			return;
		} else
			ll.remove(s);
		display(ll);
	}

	static int count(LinkedList<Student> ll) {
		return ll.size();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
