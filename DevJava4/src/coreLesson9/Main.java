package coreLesson9;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import coreLesson6.Gender;
import coreLesson6.Person;

public class Main {

	public static void main(String[] args) {
		Set<Person>set = new LinkedHashSet<>();//без лінкед буде виводитись рандомно
		set.add(new Person("Mariya", 21, Gender.FEMALE));
		set.add(new Person("Ivan", 18, Gender.MALE));
		set.add(new Person("Mykola", 21, Gender.MALE));
		System.out.println(set.add(new Person("Mykola", 21, Gender.MALE)));
		System.out.println(set);
		Set<String> tree = new TreeSet<>();//відортований сет
		tree.add("Mariya");
		tree.add("Ivan");
		tree.add("Mykola");
		System.out.println(tree);
		
		
	}

}
