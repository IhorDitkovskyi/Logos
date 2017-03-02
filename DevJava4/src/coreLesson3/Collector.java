package coreLesson3;

public class Collector extends Human{
	int a;
	
	public void eatA(String a){
		go();
		System.out.println(getName()+" mmm nyam-nyam"+a);
	}
	
	public void go(){
		System.out.println(getName()+"go-go");
	}
	
	public void star(){
		int age=0;
		System.out.println("I vas born " + "age= "+age);
		for(age=0; ; age++){
			System.out.println("age= "+age);
			if (age==10){
				System.out.println("I am dead");
				break;
			}
		}
	}
}
