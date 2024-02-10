package reverse_String;

public class Reverse_each_word_loop_split {

	public static void main(String[] args) {

		String str = "my name is danish";

		String rev = "";

		for (int i = 0; i < str.length(); i++) {
			rev = str.charAt(i) + rev;
		}
		System.out.print(rev);
		System.out.println("");

		String[] reverse = rev.split(" ");

		StringBuffer STB = new StringBuffer();

		for (int j = reverse.length - 1; j >= 0; j--) {
			STB = STB.append(reverse[j]).append(' ');
		}

		System.out.println(STB);
	}

}
