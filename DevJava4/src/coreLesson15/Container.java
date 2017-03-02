package coreLesson15;

import java.io.Serializable;
import java.util.List;

public class Container<T extends Serializable> implements Serializable{

	private static final long serialVersionUID = -6392607783154374187L;

	private T element;
	
	private List<T> list;

	public Container(T element) {
		super();
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}
	
}
