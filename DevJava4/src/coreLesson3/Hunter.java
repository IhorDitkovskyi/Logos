package coreLesson3;

public class Hunter extends Human{
	private int killedMammonts;
	
	public Hunter(int age, String name){
		super(age, name);
	}
	
	public void eatMeat(String meat){
		System.out.println(getName()+" mmm nyam-nyam"+meat);
	}
	
	public void eatMeat(){
		run();
		killedMammonts++;
		System.out.println(getName()+"I kill"+killedMammonts+"mammonts");
		eatMeat(" mammont meat");
	}

	@Override
	public void run(){
		System.out.println(getName()+": faster go-go-go");
	}
	public String toString(){
		return "Human [age="+getAge()+", name="+getName()+", killedMammonts=" + killedMammonts +"1" ;
	}
}
