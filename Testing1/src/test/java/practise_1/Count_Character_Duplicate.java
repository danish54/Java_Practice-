package practise_1;

public class Count_Character_Duplicate {

	public static void main(String[] args) {
		
		String name = "Danish ali";
		int dupe = 0;
		int total = 0;
		int fina = 0;
		char[] chr = name.toCharArray();

		for(int i=0; i< name.length(); i++) {
			
			if(chr[i] != ' ') {
				total++;
				
			}
			
			for(int j = i+1; j< name.length(); j++) {
				
				if(chr[i]==chr[j]) {
					
					dupe++;
					
					
				}
				
			}
		}
		fina = total-dupe;
		System.out.println("Number of Char is: "+ fina);
	}

}
