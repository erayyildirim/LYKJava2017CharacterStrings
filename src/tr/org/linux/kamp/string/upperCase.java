package tr.org.linux.kamp.string;
//her krakteri al buyuk yaz
public class upperCase {
	public static void main(String[] args) {
		String str = "kucukten buyuge";
		System.out.println(toUpperCase(str));
		
	}
	
	public static String toUpperCase(String str){
		String result = "";
		for(int i= 0 ; i< str.length() ; i++){
			result += Character.toUpperCase(str.charAt(i));
	}
		return result;
	}
}
