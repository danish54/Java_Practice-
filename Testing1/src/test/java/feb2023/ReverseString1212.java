package feb2023;

import org.testng.annotations.Test;

public class ReverseString1212 {

	@Test
	void rever() {
		String rever = null;
		String Rvst = null;
		String st = "my name is danish";
		String[] word = st.split("\\s+");
		for (String string : word) {
			
			//System.out.println(string);
			StringBuilder stbr = new StringBuilder(string);
			rever = stbr.reverse().toString();
			//Rvst = Rvst + " " + rever;
			System.out.print(" "+rever);
		}
		
	}
}
