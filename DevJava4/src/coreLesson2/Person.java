package coreLesson2;

public class Person {

		String name;
		int age;
		
		int dist =5000;
		
		
		Person(int age, String name){
			System.out.println(this.age+""+this.name);
			this.age=age;
			this.name=name;
		}
		void run(){
			System.out.println(name +":go-go-go");
		}
		boolean run(int dist){
			if(this.dist<0){
				System.out.println(name +"Game over");
				return false;
			}
			System.out.println(name+":"+this.dist+"m");
			this.dist-=dist;
			return true;
		}
}
