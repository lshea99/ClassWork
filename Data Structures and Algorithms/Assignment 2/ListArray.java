/**
 * COSC 310-002 Assignment 2
 * ListArray.java
 * 
 * This class creates a ListArray that stores the Part objects and
 * allows for the adding and removal of objects in the ListArray.
 * The contains method compares objects to find out if they are in
 * the ListArray and the indexOf method finds the index should the object
 * be present in thte ListArray.
 * 
 * @author Lane Shea
 */
public class ListArray<E> {

	private E[] list;
	private int size;
	
	public ListArray() {
		super();
		list =(E[]) new Object[14];
		size=0;
	}
	public ListArray(int capacity) {
		super();
		list =(E[]) new Object[10];
		size=0;
	}
	public void add( E item ) {
		if( size > list.length ) {	//array is full
			throw new ArrayIndexOutOfBoundsException();
		}
		list[size] = item;
		size++;
	}
	/**
	 * This method compares the target object to objects in the ListArray 
	 * and returns true or false depending on whether the target object is present.
	 * @param target
	 */
	public boolean contains(E target) {
		for ( int i=0;i<size; i++) {
			if (target.equals(list[i])) {
				return true;
			}
			}
		return false;
		}
	public E get(int index ) {
		return list[index];
	}
	public void remove(int index) {
		int position = index;
		size--;
		while(position < size) {
			list[position] = list[position+1];
			position++;
		}
	}
	public int size() {
		return size;
	}
	/**
	 * This method returns the index of the target object.
	 * @param target
	 */
	public int indexOf(E target) {
		for ( int i=0;i<size; i++) {
			if (target.equals(list[i])) {
				return i;
			}
			}
		return -1;
		}
	
	
		
	}

