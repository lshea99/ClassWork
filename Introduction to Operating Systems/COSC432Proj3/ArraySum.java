/**
 * ArraySum.Java
 * by Lane Shea
 * This class creates the ArraySum object that passes on bigMatrix1,bigMatrix2, summationMatrix, and the column
 *  to add to the threads for addion.
 * Also allows for printing of the summationMatrix after addition of threads.
 */
  package proj3;
 
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ArraySum implements Runnable {
	double [][] bigMatrix1 = new double[1000][10];
	double[][] bigMatrix2 = new double[1000][10];
	double[][] summationMatrix = new double[1000][10];
	int column;
	
	
	
	public ArraySum(double[][] bigMatrix1, double[][] bigMatrix2, double[][] summationMatrix, int column) {
		super();
		this.bigMatrix1 = bigMatrix1;
		this.bigMatrix2 = bigMatrix2;
		this.summationMatrix = summationMatrix;
		this.column = column;
	}

	public ArraySum(double[][] bigMatrix1, double[][] bigMatrix2, double[][] summationMatrix) {
		super();
		this.bigMatrix1 = bigMatrix1;
		this.bigMatrix2 = bigMatrix2;
		this.summationMatrix = summationMatrix;
	}

	public double[][] getAns() {
		return summationMatrix;
	}
	@Override
	public void run() {
		System.out.println("\n"+Thread.currentThread().getName() + " started" );
		for(int row = 0; row< 1000; row++) {
	
			summationMatrix[row][column] = bigMatrix1[row][column] + bigMatrix2[row][column];

		}
		
		
	}
	
}

