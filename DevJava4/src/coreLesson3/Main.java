package coreLesson3;

public class Main {

	public static void main(String[] args) {
		Hunter hunter = new Hunter(18, "Ivan");
		hunter.setName("Ivan");
		hunter.eatMeat("bird meat");
		hunter.eatMeat();
		Human human = new Human(20, "Petro");
		System.out.println(human);
		System.out.println(hunter);
		Collector collector = new Collector();
		collector.setName("Ivan");
		collector.eatA("sfvfrsv");
		collector.star();
		valueObject vo = new valueObject(23, "Red");
		System.out.println(vo);
		int size = vo.size;
		vo= vo.changeSize(34);
		System.out.println(vo);
		Human.countOfPeople();
	}

}
