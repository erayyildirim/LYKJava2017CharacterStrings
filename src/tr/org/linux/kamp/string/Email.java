package tr.org.linux.kamp.string;
//CaesarCpher
public class Email {
	public static boolean isEmailValid(String str){
		//@ ve . ile baslayamaz bosluk ıcremez
		
//		if(str.charAt(0) == '@' || str.charAt(0) == '.'){
//			return false;
//		}
		
		//noktadan sonnra kac karaker lenght ile
		
		if(str.contains(" ")){
			return false;
		}
		
		if(!str.contains("@")){
			return false;
		}
		
		if(!str.contains(".")){
			return false;
		}
		
		if(str.startsWith("@") || str.startsWith(".")){
			return false;
		}
		
//		if(str.indexOf(".")-str.indexOf("@")<1){
//			
//		}
		
		if(str.contains("@.")){
			return false;
		}
		
		if(str.length()-str.lastIndexOf(".")<=2){
			return false;
		}
		return true;
		
		
		
	}

	public static void main(String[] args) {
		String str = "df.dfg@gmail.com";
		System.out.println(isEmailValid(str));
	}

}
