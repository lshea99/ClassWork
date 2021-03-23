/**
 * COSC 310-002 Assignment 3
 * SLList.java
 * 
 * This class creates the Single Linked List with the attributes head and size.
 * 
 * @author Lane Shea
 */
public class SLList <E> {
	private Node<E> head;
	private int size=0;
	
	public SLList() {
		super();
		this.head = null;
		this.size = 0;
	}
	/*
	 * This method adds a new item to the tail of
	 * the Single Linked List.
	 */
	public void addTail(E item) {
		if(head == null) {
			head = new Node<E>(item,null);
			size++;
		}
		else {
			size++;
			Node<E> p = head;
			while( p.next != null) {
				p = p.next;
			}
			p.next = new Node<E>(item,null);
			
		}
	}
	
	
	public E remove(int index) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		int position = 0;
		Node<E> p = head;
		Node<E> q;
		if (index == 0) {
			head = p.next;
			q=p;
		}
		else {
		while( position < index-1 ) {
			p = p.next;
			position++;
			}
		q=p.next;
		p.next=p.next.next;
		}
		
		size--;
		return q.data;
		
	}
	/*
	 * This method finds the object stored at a given
	 * index.
	 */
	public E get( int index ) {
		if (index < 0 || index >= size) {
			throw new IndexOutOfBoundsException();
		}
		int position = 0;
		Node<E> p = head;
		while( position < index ) {
			p = p.next;
			position++;
		}
		return p.data;
	}
	
	public int size() {
		return size;
	}
	/*
	 * This method finds the index of a given target.
	 */
	public int indexOf( E target) {
    	Node<E> p = head;
    	int index = 0;
    	while(p != null) {
    		if(((Employee) p.data).compareTo( target ) == 0) {
    		return index;
    		}
    		p=p.next;
    		index++;
    	}
    	return -1;
    }
	/*
	 *  Node inner class
	 */
	private static class Node<E> {
		private E data;
		private Node<E> next;
		
		public Node(E data, Node<E> next) {
			super();
			this.data = data;
			this.next = next;
		}
	}
}
