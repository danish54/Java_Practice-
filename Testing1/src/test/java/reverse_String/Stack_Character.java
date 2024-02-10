package reverse_String;

import java.util.Stack;

public class Stack_Character {

	public static void main(String[] args) {


		String name = "my name is danish ali";
		Stack<Character> st=new Stack<Character>();
		
		for (int i = 0; i < name.length(); ++i) {
	        if (name.charAt(i) != ' ')
	            st.push(name.charAt(i));
	        
	        else {
	            while (st.empty() == false) {
	                System.out.print(st.pop());
	                 
	            }
	            System.out.print(" ");
	        }

	}
		while (st.empty() == false) {
            System.out.print(st.pop());
             
        }
		
	}

}
