package coreLesson4;

public interface Geometric {

		double square();
		double perimetr();
		
		public default void print ( ){
			System.out.println(this.square());
			System.out.println(this.perimetr());
		}
}
