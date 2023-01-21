package reverse_Jan6;

public class Reverse_string_loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "My name is Danish Ali";
		String rev = "";

		for (int i = 0; i < name.length(); i++) {

			rev = name.charAt(i) + rev;
		}

		String Sname[] = rev.split(" ");
		String revName = "";
		for (int i = 0; i < Sname.length; i++) {

			revName = Sname[i] + " " + revName;

		}
		System.out.println(revName);
	}

}
