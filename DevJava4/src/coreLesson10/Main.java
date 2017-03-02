package coreLesson10;

import static java.util.stream.Collectors.toList;

import java.util.ArrayList;
import static java.util.Comparator.*;
import java.util.List;
import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

import coreLesson6.Gender;
import coreLesson6.Person;

public class Main {
	private static final List<Person> list = new ArrayList<>();
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		list.add(new Person("Mariya", 21, Gender.FEMALE));
		list.add(new Person("Ivan", 18, Gender.MALE));
		list.add(new Person("Mykola", 21, Gender.MALE));
		list.add(new Person("Oksana", 19, Gender.FEMALE));
		list.add(new Person("Olya", 24, Gender.FEMALE));
		list.add(new Person("Petro", 30, Gender.MALE));
		list.add(new Person("Artem", 45, Gender.MALE));
		list.add(new Person("Ira", 38, Gender.FEMALE));
		list.add(new Person("Zlata", 40, Gender.FEMALE));
		list.add(new Person("Sergiy", 25, Gender.MALE));
		while (true) {
			System.out.println("Enter 1 to sort by name asc");
			System.out.println("Enter 2 to sort by name desc");
			System.out.println("Enter 1 to sort by age asc");
			System.out.println("Enter 2 to sort by age desc");
			switch (sc.next()) {
			case "1":
				sortByNameAsc().forEach(System.out::println);
				break;
			case "2":

				break;
			case "3":

				break;
			default:
				sc.close();
				return;
			}
		}
	}
	
	static List<Person> sortByNameAsc(){
		/*List<Person> persons = new ArrayList<Person>(list);
		persons.sort(null);
		return persons;*/
		return list.stream().sorted().collect(toList());//то саме шо вище
	}
	/*static List<Person> sortByNameDesc(){
		//List<Person> persons = new ArrayList<Person>(list);
	//	persons.sort(new PersonComparatorByNameDesc());
		//return persons;
		return list.stream()
		.sorted(o1, o2)->o2.getName().compareTo(o1.getName())).collectingAndThen(toList());
		//return list.stream().sorted().collect(toList());//то саме шо вище
	}*/
	static List<Person> sortByAgeAsc(){
	
		return list.stream()
		.sorted(comparingInt(Person::getAge)).collect(toList());//то саме шо вище
	}
	
	static List<Person> sortByAgeDesc(){
		
		return list.stream()
		.sorted(comparingInt(Person::getAge).reversed()).collect(toList());//то саме шо вище
	}
	
	static List<Person> sortByAllDesc(){
		
		return list.stream()
		.sorted().collect(toList());//то саме шо вище
	}
}
