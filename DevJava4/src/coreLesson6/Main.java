package coreLesson6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Person person = new Person("Ivan", 18, Gender.MALE);
		Gender gender = Gender.MALE;
		// можна будь як викликити
		System.out.println(Gender.MALE == Gender.MALE);
		System.out.println(Gender.MALE == gender);
		System.out.println(Gender.MALE == person.getGender());

		Month[] months = Month.values();
		for (int i = 0; i < months.length; i++) {
			System.out.println(months[i]);
		}

		String monthName = "may";
		Month month = Month.valueOf(monthName.toUpperCase()); // робить верхній
																// регістр
		System.out.println(month);

		System.out.println(month.compareTo(Month.JUNE));
		System.out.println(month.ordinal());// повертає номер по порядку;

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter 1 to show month by season");
			System.out.println("Enter 2 to show month by counts of days");
			
			switch (sc.next()) {
			
			case "1":
				System.out.println("Enter season's name");
				String res = sc.next();
				for (int i = 0; i < months.length; i++) {
					if(months[i].getSeason()==Season.valueOf(res.toUpperCase())){
						System.out.println(months[i]);
					} 
				}
				break;
			
			case "2":
				System.out.println("Enter days count");
				int res1 = sc.nextInt();
				for (int i = 0; i < months.length; i++) {
					if(res1==months[i].getDays()){
						System.out.println(months[i]);
					}
				}
				break;
			default:
				sc.close();
				return;
			}
		}

	}
/*
	static boolean exist(Enum<?>[] enums, String name){
		name=name.toUpperCase();
		for (int i = 0; i < enums.length; i++) {
			if (enums[i].name().equals(name)){
			return true;
			}
		}
		return false;
	}*/
}
