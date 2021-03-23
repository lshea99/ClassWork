/**
 * Project3.Java
 * by Lane Shea
 * This is the main class that reads the bigMatrix1 and bigMatrix2 files and assigns them to threads.
 * From there, the threads are started and the first and last row of the matrix is printed.
 */

package proj3;
import java.io.BufferedWriter;
import java.io.File;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;
import proj3.ArraySum;
public class Project3{
	
		public static void main(String[] args)  {
			double[][] bigMatrix1= new double[1000][10];
			double[][]bigMatrix2 = new double[1000][10];
			double[][] summationMatrix = new double[1000][10];
			ArraySum sum = new ArraySum(bigMatrix1,bigMatrix2,summationMatrix);
			
			Scanner inFile = null;
			try {
		           inFile = new Scanner( new File( "bigMatrix1.txt" ) );
		        }
		        catch( FileNotFoundException e ) {
		        
		            System.out.println( "Error: File not found" );
		        }
			
			for (int row = 0; row < 1000; row++) {	
				for (int column = 0; column < 10; column ++) {
					double input = inFile.nextDouble();
					bigMatrix1[row][column] = input;
				}
				
			}
			try {
		           inFile = new Scanner( new File( "bigMatrix2.txt" ) );
		        }
		        catch( FileNotFoundException e ) {
		        
		            System.out.println( "Error: File not found" );
		        }
			
			for (int row = 0; row < 1000; row++) {
				for (int column = 0; column < 10; column ++) {
					double input = inFile.nextDouble();
					bigMatrix2[row][column] = input;
				}
			}
			
		
			
			
			
			Thread a0 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,0));
			Thread a1 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,1));
			Thread a2 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,2));
			Thread a3 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,3));
			Thread a4 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,4));
			Thread a5 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,5));
			Thread a6 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,6));
			Thread a7 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,7));
			Thread a8 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,8));
			Thread a9 = new Thread(new ArraySum(bigMatrix1,bigMatrix2,summationMatrix,9));
			a0.start();
			try {
				a0.join();
				System.out.println("Thread-0 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a1.start();
			try {
				a1.join();
				System.out.println("Thread-1 Finished");
	
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a2.start();
			try {
				a2.join();
				System.out.println("Thread-2 Finished");
	
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a3.start();
			try {
				a3.join();
				System.out.println("Thread-3 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a4.start();
			try {
				a4.join();
				System.out.println("Thread-4 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a5.start();
			try {
				a5.join();
				System.out.println("Thread-5 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a6.start();
			try {
				a6.join();
				System.out.println("Thread-6 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a7.start();
			try {
				a7.join();
				System.out.println("Thread-7 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a8.start();
			try {
				a8.join();
				System.out.println("Thread-8 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
			a9.start();
			try {
				a9.join();
				System.out.println("Thread-9 Finished");
			} catch (Exception e) {
				System.out.println("Exception"+e+"has been caught.");
			}
		
			
			
			summationMatrix = sum.getAns();
			System.out.println("First Row: ");
			for (int i=0;i<10;i++) {
				System.out.print(" "+summationMatrix[0][i] +" ");
			}
			System.out.println("\nLast Row: ");
			for (int i=0;i<10;i++) {
				System.out.print(" "+summationMatrix[999][i]+" ");
			
				try (BufferedWriter out = new BufferedWriter(new FileWriter("summationMatrix.txt"))) {
					for(int x=0;x<summationMatrix.length;x++) {
						for(int y=0;y<summationMatrix[x].length;y++) {
							out.write(summationMatrix[x][y] +"      ");
						}
					}
				} catch( IOException e) {
						System.out.println("Error: File already exists");
					} 
			
				/**
				 * ArraySum
				 * by Lane Shea
				 * This class creates the ArraySum object that passes on bigMatrix1,bigMatrix2, summationMatrix, and the column
				 *  to add to the threads for addion.
				 * Also allows for printing of the summationMatrix after addition of threads.
				 */
				
				class ArraySum implements Runnable {
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
		
		}		
}
		}

	

