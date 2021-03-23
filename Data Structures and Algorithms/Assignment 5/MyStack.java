/**
 * COSC 310-002 Assignment 5
 * MyStack.java
 * 
 * This class creates a stack of generic
 * objects using a single linked list.
 * 
 * @author Lane Shea
 */
public class MyStack <E> {
	private Node<E> top;

	public void push( E item) {
		top = new Node<E>(item, top);
	}
	
	public E pop() {
		E temp = top.data;
		top = top.next;
		return temp;
	}
	
	public E peek() {
		return top.data;
	}
	
	public boolean empty() {
		return top == null;
	}
	
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
