package coreLesson8;

import java.util.Comparator;

import coreLesson6.Person;

public class PersonComparatorBuNameDesc implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		return o2.getName().compareTo(o1.getName());
	}

}
