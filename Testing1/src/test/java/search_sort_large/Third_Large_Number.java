package search_sort_large;

public class Third_Large_Number {

	public static void main(String[] args) {

		int arr[] = { 30, 4, 10, 50, 12, 4, 7 };
		int first = arr[0], second = arr[1], third = arr[2];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > first) {
				first = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > second && arr[i] < first) {
				third=second;
				second = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > third && arr[i] < second) {
				third = arr[i];
			}
		}

		System.out.println(first + " " + second + " " + third);

	}

}
