package feb2023;

interface A {
	public int GetResult(int a, int b);
}

interface B {

	public int GetResult(int a, int b);
}

public class Ovverrideg implements A, B {
	public static void main(String args[]) {

	}

	@Override
	public int GetResult(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
}