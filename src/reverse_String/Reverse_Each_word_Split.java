package reverse_String;

public class Reverse_Each_word_Split {

	public static void main(String[] args) {

		String str = "my name is danish";

		StringBuffer s = new StringBuffer(str);
		str = s.reverse().toString();
		//reversing whole string first
		
		String[] rev = str.split(" ");
		
		System.out.println("split value "+rev);
		
		StringBuffer reverse = new StringBuffer();
		
		//now splitting and reversing whole array
		
		for (int i = rev.length - 1; i >= 0; i--) {
			reverse.append(rev[i]).append(" ");
		}

		reverse.toString();
		System.out.println(reverse);
	}

}
