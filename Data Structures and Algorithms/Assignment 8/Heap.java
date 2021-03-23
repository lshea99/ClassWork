/*
 *  COSC 310
 *  Heap.java 
 *  
 *  This class implements a min heap using an array.
 *  
 *  @author  Terry Fries
 */

import java.util.Arrays;

public class Heap<E extends Comparable>
{
	private E[] arr;
	private int size;
	
	public Heap()
	{
		super();
		arr = (E[]) new Comparable[10];
		size = 0;
	}

	public Heap( int capacity )
	{
		super();
		arr = (E[]) new Comparable[capacity];
		size = 0;
	}
	
	public boolean enqueue( E item )
	{
		if( size == arr.length )		// if heap is full
		{
			return false;
		}
		
		arr[size] = item;
		size++;
		int child = size - 1;
		int parent = (child - 1) / 2;
		while( parent >=0 && arr[parent].compareTo( arr[child] ) > 0 )
		{
			E temp = arr[parent];
			arr[parent] = arr[child];
			arr[child] =  temp;
			child = parent;
			parent = (child -1 ) / 2;
		}
		return false;
	}
	
	public E dequeue()
	{
		if( size == 0 )					// if heap is empty
		{
			return null;
		}
		
		E returnValue = arr[0];
		arr[0] = arr[size-1];
		size--;
		int parent = 0;
		while( true )
		{
			int leftChild = 2 * parent + 1;
			int rightChild = leftChild + 1;
			if( leftChild > size )
			{
				break;
			}
			int minChild = leftChild;
			if( rightChild < size && arr[rightChild].compareTo( arr[leftChild] ) < 0 )
			{
				minChild = rightChild;
			}
			if( arr[parent].compareTo( arr[minChild] ) > 0 )
			{
				E temp = arr[parent];
				arr[parent] = arr[minChild];
				arr[minChild] =  temp;
				parent = minChild;
			}
			else
			{
				break;
			}
		}
		return returnValue;
	}

	@Override
	public String toString()
	{
        return Arrays.toString( arr );
	}
	
	
}