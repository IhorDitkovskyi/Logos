package coreLesson5;

public class Main2 {

	public static void main(String[] args) {
		Header header = new IndexHeader();
		Body body = new IndexBody();
		Footer footer = new IndexFooter();
		Engine engine = new Engine(header, body, footer);
		engine.printPage();
		Body leftSide = new LeftSideBarBody();
		Engine left = new Engine(header, leftSide, footer);
		System.out.println();
		left.printPage();
		Body rightSide = new RightSideBarBody();
		Engine right = new Engine(header, leftSide, footer);
		System.out.println();
		right.printPage();
		
	}

}
