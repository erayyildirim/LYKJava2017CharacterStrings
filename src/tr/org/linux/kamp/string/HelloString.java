package tr.org.linux.kamp.string;

public class HelloString {
	public static void main(String[] args) {
		
//		String str = Integer.toString(185);
//		System.out.println(str);
		
//		if("hello"=="hello"){
//			System.out.println("a");
//		}
		
//		String  a = new String("hello");
//		String b = new String("hello");
//		if(a==b){
//			System.out.println("eşit");
//		}
//		else System.out.println("referanslar farklı oldugu ıcın false dondu");
//		
		String str = "hello World";
//		System.out.println(str.substring(1, 7));
//		
//		System.out.println(str.indexOf(" "));
//		
//		System.out.println(str.charAt(str.length()-1)); //son harf
//		
//		System.out.println(str.lastIndexOf('1',2));
		System.out.println(str.substring(0,2).equals("he")); //buyuk kucuk harfe duyarlı
		System.out.println(str.substring(0,2)==("he"));
		
	}
	


}
