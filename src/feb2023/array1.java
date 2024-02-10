package feb2023;

public class array1 {
	
public static void main(String[] args) {
	
	try {
		
		int[] Arr = new int[5];
		Arr[0] = 2;
		Arr[1] = 4;
		Arr[2] = 6;
		Arr[3] = 10;
		System.out.println(Arr[5]);
		
	} catch (IndexOutOfBoundsException e) {
		
		//System.out.println("Invalid Input");
		System.out.println(e);
	}
	
	
	
	
}
	
}
