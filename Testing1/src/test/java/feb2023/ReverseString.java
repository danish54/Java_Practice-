package feb2023;

import org.testng.annotations.Test;

public class ReverseString {

	@Test
	void rvstrng() {

		String name = "my name is danish";

		int a = name.split("\\s+").length;
		System.out.println(a);

	}

	@Test
	void wordcount() {

		String name = "my name is danish";

		String rev = "";
		for (int i = 0; i < name.length(); i++) {
			rev = name.charAt(i)+rev;
		}
		System.out.println("Name "+rev);
		String find=" ";
		
		String[] rtg = rev.split("\\s+");
		for (int i=0; i<rtg.length; i++) {
			find = rtg[i]+" "+find;
			
		}
		System.out.println(find);
	}

}
