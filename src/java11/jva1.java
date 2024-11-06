package java11;

import java.util.Scanner;
public class jva1 {
public static void main(String []args) {
	jva1 j1 = new jva1();
	j1.get();
	j1.display();
}
	static Scanner s;
	public static int m1;
	public static int m2;
	static void get() {
		s = new Scanner(System.in);
		System.out.println("Enter the number 1:");
		m1=s.nextInt();
		System.out.println("Enter the number 2:");
		m2=s.nextInt();
}
	static void display() {
		System.out.println("Result: "+ (m1*m2));
	}
	
}
