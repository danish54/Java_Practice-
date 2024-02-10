package reverse_Jan6;

public class Reverse_String {

	public static void main(String[] args) {

		String s = "my name is danish";
		System.out.println(s);
		String rev = "";
		StringBuffer str = new StringBuffer(s);

		String st = str.reverse().toString();

		//System.out.println(st);
		String[] name = st.split(" ");
		for (String e : name) {

			rev = " " + e + rev;

		}
rev = rev.strip();
		System.out.print(rev);

	}

}
