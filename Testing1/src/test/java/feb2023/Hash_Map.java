package feb2023;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Hash_Map {

	@Test
	public void CapitalCity() {

		/*
		 * LinkedList<String> map = new LinkedList<String>(); map.add("danish");
		 * System.out.println(map.get(0));
		 * 
		 * ArrayList<String> Armap = new ArrayList<String>(); Armap.add("amish");
		 * System.out.println(Armap.get(0));
		 * 
		 * HashMap<String, String> Nmap = new HashMap<String, String>();
		 * Nmap.put("Danish", "Ali");
		 */

		// System.out.println(Nmap.get("Danish"));

		HashMap<String, String> capitalCities = new HashMap<String, String>();

		// Add keys and values (Country, City)
		capitalCities.put("England", "London");
		capitalCities.put("Germany", "Berlin");
		capitalCities.put("Norway", "Oslo");
		capitalCities.put("USA", "Washington DC");
		// System.out.println(capitalCities);
		System.out.println(capitalCities.get("England"));

	}

	@Test
	public void Bikes() {
		HashMap<String, Integer> Bike = new HashMap<String, Integer>();
		Bike.put("TVS", null);
		Bike.put("Sports", 90);

		try {
			int A = Bike.get("TVS");
			System.out.println(A);
			int B = Bike.get("Sports");
			System.out.println(B);
		} catch (NullPointerException e) {

			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

	@Test
	public void has() {

		HashMap<String, Integer> Bike = new HashMap<String, Integer>();
		Bike.put("TVS", null);
		Integer A = Bike.get("TVS"); // Use Integer instead of int to handle null values
		System.out.println(A); // Output: null
	}

	@Test
	public void has1() {

		// int n=5;
		for (int i = 0; i <= 5; i++) {
			for (int j = 5; j >= i; j--) {

				System.out.print(" ");

			}
			for(int j = 0; j <= i*2; j++) {
				
				System.out.print("*");
				
			}

			System.out.println("");
		}
		System.out.println("");

	}
	
	@Test
	public void patttern() {
		
		for (int i = 0; i <= 5; i++) {
		    for (int j = 0; j < 5 - i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 0; j < i * 2 + 1; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}
		System.out.println();
	}
	
	@Test
	void downTriangle(){
		for(int i=0; i<=5; i++) {
			
			for(int j=0; j<=i;j++ ) {
				System.out.print(" ");
			}
			
			for(int j =0; j<=(5-i)*2; j++) {
				System.out.print("*");	
			}
			
			System.out.println(" ");
		}
		
	}
	
	@Test
	void iyiuyi() {
		for (int i = 0; i <= 5; i++) {
		    for (int j = 0; j <= i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 0; j <= (5 - i) * 2 ; j++) {
		        System.out.print("*");
		    }
		    System.out.println(); // Move to the next line after each row
		}
	}
	
	@Test
	void iuu() {
		for (int i = 0; i <= 5; i++) {
			
			for(int j=0; j<=i;j++) {
				System.out.print(" ");
				
			}
			for(int j=0; j<=(5-i)*2; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}
	
	
	@Test
	void wordcount() {
	
		        String sentence = "This is a sample sentence ?"; // Example sentence

		        // Split the sentence into words based on whitespace
		        String[] words = sentence.split("\\W+");

		        // Count the number of words
		        int wordCount = words.length;

		        System.out.println("Number of words in the sentence: " + wordCount);
		    }
	
	@Test
	void matc() {
		
		String i = "Bvbnrfty";
		boolean bol = i.toLowerCase().matches(".*[aeiou].*");
		System.out.println(bol);
	}
	
}