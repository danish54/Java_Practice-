package practise_1;

public class Reverse_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "My name is danish";
		String reverse= "";
		String Final_rev="";
		
		for(int i = 0; i<name.length(); i++) {
			
			reverse = name.charAt(i)+reverse;
		}
		
		
		
		
		String[] rev_each_w = reverse.split(" ");
		
		for(int j=0; j<rev_each_w.length; j++) {
			Final_rev= rev_each_w[j]+" "+Final_rev;
			
			
		}
		System.out.println(Final_rev);
	}

}
