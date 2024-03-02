package feb2023;

import java.util.Random;
import java.util.Scanner;

import org.testng.annotations.Test;

public class ArraySum {
	
	@Test
	void arrysun() {
	
		        Scanner scanner = new Scanner(System.in);
		        
		        // Input the size of the array
		        System.out.print("Enter the size of the array (e.g., 4 for a 4x4 array): ");
		        int size = scanner.nextInt();
		        
		        // Create a 2D array with random numbers
		        int[][] array = createRandomArray(size);
		        
		        // Print the array
		        System.out.println("Generated Array:");
		        printArray(array);
		        
		        // Calculate and print the sum of rows
		        for (int i = 0; i < array.length; i++) {
		            int rowSum = calculateRowSum(array, i);
		            System.out.println("Sum of Row " + (i + 1) + ": " + rowSum);
		        }
		        
		        // Calculate and print the sum of columns
		        for (int j = 0; j < array[0].length; j++) {
		            int columnSum = calculateColumnSum(array, j);
		            System.out.println("Sum of Column " + (j + 1) + ": " + columnSum);
		        }
		        
		        scanner.close();
		    }
		    
		    // Method to create a 2D array with random numbers
		    public static int[][] createRandomArray(int size) {
		        Random random = new Random();
		        int[][] array = new int[size][size];
		        for (int i = 0; i < size; i++) {
		            for (int j = 0; j < size; j++) {
		                array[i][j] = random.nextInt(10); // Random numbers between 0 and 9
		            }
		        }
		        return array;
		    }
		    
		    // Method to print a 2D array
		    public static void printArray(int[][] array) {
		        for (int[] row : array) {
		            for (int num : row) {
		                System.out.print(num + " ");
		            }
		            System.out.println();
		        }
		    }
		    
		    // Method to calculate the sum of a row in a 2D array
		    public static int calculateRowSum(int[][] array, int rowIndex) {
		        int sum = 0;
		        for (int j = 0; j < array[0].length; j++) {
		            sum += array[rowIndex][j];
		        }
		        return sum;
		    }
		    
		    // Method to calculate the sum of a column in a 2D array
		    public static int calculateColumnSum(int[][] array, int columnIndex) {
		        int sum = 0;
		        for (int i = 0; i < array.length; i++) {
		            sum += array[i][columnIndex];
		        }
		        return sum;
		    }
		

	}
