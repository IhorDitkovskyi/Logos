package coreLesson12;

public class MyException extends RuntimeException{


	private static final long serialVersionUID = -8121179349821769298L;

	@Override
	public void printStackTrace() {
		System.err.println("Сам догадайся де помилка");
	}
}
