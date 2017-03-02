package coreLesson7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Ivan");
		list.add("Petro");
		list.add(1, "Mykola"); //Так не робити! Першим буде іван, потім микола, потім петро.
		System.out.println(list);
		System.out.println(list.contains("Ivan")); //перевіряє, чи є такий едлемент в лісті, не залежно від порядку елементів
		System.out.println(list.containsAll(list));

		
		//--------------------------------працють однаково
		list.forEach(System.out::println); 
		for (String string : list) {
			System.out.println(string);
			System.out.println(string.substring(0,1));
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		//----------------------------------------------
		
		System.out.println(list.indexOf("Ivan"));
		System.out.println(list.remove(0));
		System.out.println(list);
		list.set(0, "Ivan");
		System.out.println(list);
		LinkedList<String> list2 = new LinkedList<>();
		System.out.println(list.indexOf("Ivan"));
		
		
	}

}
