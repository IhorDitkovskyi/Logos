package Lesson2;



public class Main {

	public static void main(String[] args) {
		int i = 0;
		switch (i) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("default");
		}

		while (i < 10) {
			System.out.println(++i);
		}

		do {
			System.out.println(++i);
		} while (i < 10);

		for (int j = 0; j < 10; j++) {
			System.out.println(j);
			hello();

			int increment = increment(1);
			System.out.println(increment);
			
			System.out.println(calculate(45, 15, '-'));

		}
	

	}

	static void hello() {
		System.out.println("Hello");
	}

	static int increment(int i) {
		i++;
		return i;
	}

	static double add(double f, double g) {
		
		return  f + g;
	}

	static double mul(double f, double g) {
		 
		return  f * g;
	}

	static double sub(double f, double g) {
		
		return f - g;
	}

	static double div(double f, double g) {
		 
		return f / g;
	}

	static double calculate(double a, double b, char oper) {
		switch (oper) {
		case '+':
			return add(a, b);
		case '-':
			return sub(a, b);
		case '*':
			return mul(a, b);
		case '/':
			return div(a, b);
		default:
			calculate(a, b, oper);
			return 0;
			
		}
	}
}
