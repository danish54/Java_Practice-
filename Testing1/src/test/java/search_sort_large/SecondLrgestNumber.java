package search_sort_large;

import java.util.Arrays;

public class SecondLrgestNumber {

	public static void main(String[] args) {

		int[] arr = { 4, 7, 11, 4, 6, 8, 2, 10 };
		Arrays.sort(arr);
		int n = arr.length;
		System.out.println(arr[n - 2]);
	}

}
