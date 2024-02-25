package feb2023;

import org.testng.annotations.Test;

public class PrimeNumber {
	
	public boolean IsPrimem(int num) {
		
		if (num == 0 || num == 1)
			return false;

		for (int i = 2; i <= num / 2; i++) {
			if (num % 2 == 0) {
				return false;
			}
			}
		return true;}

	@Test
	public void IsPrime() {
		boolean bol = IsPrimem(7);
		if (bol==true) {
			System.out.println("Its a Prime number");
		}
		else {
			System.out.println("Not a Prime Number");
		}
		
	}
}
