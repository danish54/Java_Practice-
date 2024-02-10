package search_sort_large;

import java.util.Arrays;

public class Find_third_large {

	public static void main(String[] args) {
		
		int[] arr = { 10, 12, 6, 7, 19, 16 };
		
		Arrays.sort(arr);
		
		for(int e:arr) {
			System.out.print(e+", ");
		}

	}

}
