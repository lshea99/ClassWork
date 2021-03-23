/**
 * COSC 310-002 Assignment 4
 * DLList.java
 * 
 * This class creates the Double Linked List with the attributes head, tail, and size.
 * 
 * @author Lane Shea
 */
import java.util.Iterator;
import java.util.NoSuchElementException;

public class DLList<E> {
	private Node<E> head = null;
	private Node<E> tail = null;
	private int size = 0;
	
	public void add(E item) {
		if (head==null) {
			head = new Node<E>(item,null, null);
			tail = head;
			size++;
		}
		else {
			tail.next = new Node<E>( item, null, tail);
			tail = tail.next;
			size++;
		}
	}
	
	public Iterator<E> iterator() {
		return new ListIter();
	}
	
	public Iterator<E> iteratorReverse() {
		return new ReverseListIter();
	}
	public int size() {
		return size;
	}
	public E get(int index) {
		if(index<0 || index>= size) {
			throw new IndexOutOfBoundsException();
		}
	Node<E> p = head;
	int position = 0;
	while( position < index ) {
		p = p.next;
		position++;
	}
	return p.data;
	}
	/*
	 * Node inner class
	 */
	
	private static class Node<E> {
		private E data;
		private Node<E> next;
		private Node<E> prev;
		
		public Node(E data, Node<E> next, Node<E> prev) {
			super();
			this.data = data;
			this.next = next;
			this.prev = prev;
		}
	}
	
	
	/*
	 * ListIter reverse inner class
	 */
	private class ReverseListIter implements Iterator<E> {
		private Node<E> nextItem = tail;
		private Node<E> lastItemReturned = null;
		public boolean hasNext() {
			return nextItem != null;
		}
		public E next() {
			if ( !hasNext() ) {
				throw new NoSuchElementException();
			}
			lastItemReturned = nextItem;
			nextItem = nextItem.prev;
			return lastItemReturned.data;
		}
		
	}
	/*
	 * ListIter inner class
	 */
	
	private class ListIter implements Iterator<E> {
		private Node<E> nextItem = head;
		private Node<E> lastItemReturned = null;
		public boolean hasNext() {
			return nextItem != null;
		}
		public E next() {
			if ( !hasNext() ) {
				throw new NoSuchElementException();
			}
			lastItemReturned = nextItem;
			nextItem = nextItem.next;
			return lastItemReturned.data;
		}
		
	}

}
