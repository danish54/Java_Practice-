package feb2023;

import java.util.Arrays;

import org.testng.annotations.Test;

public class SortArraySearch {

	@Test
	public void Searching1() {
		
int[] array = { 10, 5, 8, 3, 1, 9, 4, 7, 2, 6 };
        
        // Sorting the array using Arrays.sort() method
        Arrays.sort(array);
        System.out.println("Sorted array: " + Arrays.toString(array));
	}
}
