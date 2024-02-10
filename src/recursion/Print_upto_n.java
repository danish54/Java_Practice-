package recursion;

public class Print_upto_n {

	public static void PrintN(int n) {
		if (n == 6) {
			return;
		}

		System.out.println(n);
		PrintN(n + 1);
	}

	public static void main(String[] args) {

		PrintN(1);
	}

}
