package tr.org.linux.kamp.string;

public class reverseString {
	public static String reverseStringg(String str) {
		String result = "";
		// for(int i=str.length()-1; i>=0; i--){
		// result += str.charAt(i);
		//
		//
		// }
		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(str.length() - i - 1);
		}

		return result;

	}
	
	

	public static void main(String[] args) {
		String str = " merhaba";
		System.out.println(reverseStringg(str));
		String str1 = "ey edip adana";
		
	}
	
	

}
