package string;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.testng.annotations.Test;

public class String_declaration {

	@Test(enabled = false)
	public void Stringg() {
		String str = new String("Danish is my name");
		System.out.println(str);
	}

	@Test
	public void String1() {
		int i = 888888888;
		String str = Integer.toString(i);
		System.out.println(str);
	}

	@Test
	public void test2() {
		int in = 567891;
		String str = String.valueOf(in);
		System.out.println(str);

	}

	@Test
	public void test1() {

		BigInteger lg = new BigInteger("584775938579384");

		String st = lg.toString();
		System.out.println(st);

	}

	@Test
	public void test3() {
		StringBuilder stb = new StringBuilder("my name is danish");
		String st = stb.toString();
		System.out.println(st);

	}

	@Test
	public void test4() {

		char[] chararry = { 'a', 'b', 'c', 'd' };
		String str = new String(chararry);
		System.out.println(str);
	}

	@Test
	public void test5() {
		String[] name = new String[3];
		name[0] = "name";
		name[1] = "is";
		name[2] = "danish";
		String st = String.join("name", name);
		System.out.println(st);

	}

	@Test
	public void ReverseString() {
		String str = "my name is danish";
		String[] namearr = str.split(" ");

		for (String word : namearr) {

			int l = word.length();
			char[] wordarray = word.toCharArray();
			for (int i = l - 1; i >= 0; i--) {

				System.out.print(wordarray[i]);
			}
			System.out.print(" ");
		}

	}

	@Test
	public void reversestring2() {
		String str = "My Name is Danish";
		String revers = Arrays.stream(str.split(" ")).map(word -> new StringBuilder(word).reverse()).collect(Collectors.joining(" "));
		System.out.println(revers);

	}
}
