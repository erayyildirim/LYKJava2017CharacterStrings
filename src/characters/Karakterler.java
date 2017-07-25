package characters;

import java.util.Random;

public class Karakterler {
	public static void main(String[] args) {
//		char a = 97;
//		System.out.println(a);
//		System.out.println((char)97);
//		System.out.println('a'+1);
//		System.out.println((char)(97+1));
		
//		System.out.println(Character.toUpperCase('a'));
//		System.out.println(Character.toUpperCase('2'));
//		System.out.println(Character.toLowerCase('A'));
		
		Random rgen = new Random();
		char a = (char) (rgen.nextInt(26)+'A');
		System.out.println(a);
		

		
	}
}
