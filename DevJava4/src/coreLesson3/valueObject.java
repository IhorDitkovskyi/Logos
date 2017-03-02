package coreLesson3;

public final class valueObject {
	public final int size;
	public final String color;
	public valueObject(int size, String color) {
		this.size = size;
		this.color = color;
	}
	@Override
	public String toString() {
		return "valueObject [size=" + size + ", color=" + color + "]";
	}
	
	public valueObject changeSize(int size){
		return new valueObject(size, color);
	}
	
	public valueObject changeColor(int size){
		return new valueObject(size, color);
	}
}
