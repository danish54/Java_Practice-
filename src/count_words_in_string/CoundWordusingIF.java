package count_words_in_string;

public class CoundWordusingIF {

	public static void main(String[] args) {
		String s = " my name is danish ali ";
		s = s.trim();
		int L = s.length();

		int count = 0;

		for (int i = 0; i < L; i++) {
			if (s.charAt(i) == ' ') {
				count++;

			} else {
				continue;
			}
		}
		count++;

		System.out.println(count);

	}
}
