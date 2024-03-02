package feb2023;

public class Tryct {
	
	
	public int sum(int a, int b) {
		
		a +=b;
		return a;
	}
	public static void main(String[] args) {
	try {
		Tryct n = new Tryct();
		int sm = n.sum(1,5);
		System.out.println(sm);
		
	} catch (Exception e) {
		// TODO: handle exception
	}

}
}