package count_words_in_string;

public class CoundWord {

	public static void main(String[] args) {
		
		String s = "my name is danish ali";
		
		String[] count = s.split(" ");
		
		System.out.println(count.length);
		for(String e :count) {
			System.out.println(e);
		}
			
		}

	}


