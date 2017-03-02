package lesson1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Hello!");
		boolean bool = false;
		int i = 1;
		double yy = 3.4;
		float f = 3.4f;
		char ch = 'f';
		byte by = 1;
		short sh = 1;
		long l = 3000000000L;

		if (i > 0) {
			System.out.println("True");
		} else if (!bool) {
			System.out.println("false");
		} else {
			System.out.println("second else");
		}
		double a = 2;
		double b = 6;
		double c = 4;
		double d = 0;
		double x1 = 0;
		double x2 = 0;
		d = (b * b) - (4 * a * c);

		if (d < 0) {
			System.out.println("розв'язку немає");
		} else if (d > 0) {
			x1 = (-b - Math.sqrt(d)) / (2 * a);
			x2 = (-b + Math.sqrt(d)) / (2 * a);
			System.out.println("x1=" + x1);
			System.out.println("x2=" + x2);
		} else {
			x1 = -b / (2 * a);
			System.out.println(x1);
			
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter nymber");
		int res = sc.nextInt();
		System.out.println(res);
	}

}
