package coreLesson1;

public class Main {

	public static void main(String[] args) {
		String s = "Hello";
		String s1 = "Hello";
		String s2 = new String("Hello");
		String s3 = null;
		System.out.println(s == s1);
		System.out.println(s == s2);
		System.out.println(s.charAt(0));
		System.out.println(s.chars().sum());
		System.out.println(s.codePointAt(0));
		System.out.println("Compare to");
		System.out.println(s.compareTo(s2));
		System.out.println(s3 + s);
		// System.out.println(s.concat(s3));
		System.out.println(s.equals(s2));
		System.out.println(s.equalsIgnoreCase(s2));
		System.out.println(s.contains("ll"));
		StringBuffer cs = new StringBuffer("Hello");
		System.out.println(s.contentEquals(cs));
		System.out.println(s.endsWith("lo"));
		System.out.println(s.indexOf("l"));
		System.out.println(s.indexOf("l", 3));
		System.out.println("".isEmpty());
		System.out.println("".isEmpty());
		System.out.println("  ".trim().isEmpty());
		System.out.println(s.length());
		System.out.println(s.matches("^[A-Za-z]+$"));
		System.out.println(s.replace("ll", "bfvnjk"));
		// System.out.println(delete("hello i ebv", "e"));
		System.out.println();
		System.out.println("my metod");
		System.out.println(compareTo("Hello", "Hello"));

	}

	static String delete(String str, String deleted) {
		while (str.contains(deleted)) {
			int index = str.indexOf(deleted);
			String first = str.substring(0, index);
			String second = str.substring(0, index + 1);
			str = first + second;
		}
		return str;
	}

	static int compareTo(String str1, String str2) {
		int min = 0;
		if (str1.length() < str2.length()) {
			min = str1.length();
		} else {
			min = str2.length();
		}

		for (int i = 0; i < min; i++) {
			if (str1.codePointAt(i) != str2.codePointAt(i)) {
				return str1.codePointAt(i) - str2.codePointAt(i);
			}
			// System.out.println(str1.codePointAt(str2));

		}
		return str1.length() - str2.length();
	}
}
