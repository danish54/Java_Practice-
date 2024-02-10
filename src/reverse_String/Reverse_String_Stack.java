package reverse_String;

import java.util.Stack;

public class Reverse_String_Stack {

	public static void main(String[] args) {
		
		String inputText = "my name is danish"; 

		Stack<Character> str = new Stack<Character>();
		
		for(int i=0; i<inputText.length(); i++) {
			
			if(inputText.charAt(i) != ' ') {
			str.push(inputText.charAt(i));
			}
			else {
				while(str.isEmpty() == false) {
				System.out.print(str.pop());
			}
				System.out.print(" ");
			}
			
		}
		while(str.isEmpty() == false)
			System.out.print(str.pop());
		
	}

}
