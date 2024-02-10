package search_sort_large;

import java.util.Arrays;

public class Find_Third_Large_Number {

	public static void main(String[] args) {

		int[] arr = { 10, 12, 6, 7, 19, 16 };

		int LargeNumber = ThirdLargeNum(arr);
		System.out.println(LargeNumber);
	}

	public static int ThirdLargeNum(int[] arr) {

		Arrays.sort(arr);

		int n = arr.length;
		return arr[n - 3];

	}

}
