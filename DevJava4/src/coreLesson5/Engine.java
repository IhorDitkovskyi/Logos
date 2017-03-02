package coreLesson5;

public class Engine {

	private final Header header;
	private final Body body;
	private final Footer footer;

	public Engine(Header header, Body body, Footer footer) {
		super();
		this.header = header;
		this.body = body;
		this.footer = footer;
	}
	
	public void printPage(){
		printHeader();
		printBody();
		printFooter();
	}

	public void printHeader() {
		if (header!=null)
		header.printHeader();
		
	}

	public void printBody() {
		if (body!=null)
		body.printBody();
	}

	public void printFooter() {
		if (footer!=null)
		footer.printFooter();
	}

}
