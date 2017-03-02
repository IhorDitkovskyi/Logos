package coreLesson15;

import java.util.ArrayList;
import java.util.List;

import coreLesson4.Circle;
import coreLesson4.Geometric;
import coreLesson4.Rectangle;

public class Main {

	public static void main(String[] args) {

		Container<String> container = new Container<>("Ivan");
		System.out.println(container.getElement());
		
		List<Geometric> list = new ArrayList<>();
		list .add(new Rectangle(4,3));
		add(list , new Circle(5));
		print(list);
		
	}
	
	//метод продюсер пишеться коли хочем шось додати
	static void add(List<? super Geometric> list, Geometric geometric){
		list.add(geometric);
	}

	//метод консюмер пишеться коли хочем шось використати
	static void print(List<? extends Geometric>list){
		for (Geometric geometric : list){
			geometric.print();
		}
	}
}
