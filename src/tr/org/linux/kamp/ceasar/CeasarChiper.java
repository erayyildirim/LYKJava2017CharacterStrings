package tr.org.linux.kamp.ceasar;

import java.util.Scanner;

public class CeasarChiper {
	public static String chiper(String str,int key) {
		String ceasar = "";
		
		for (int i = 0; i < str.length(); i++) {
			
			if(str.charAt(i) >= 'A' && str.charAt(i)<= 'Z' && str.charAt(i)+key-'A'>=26){
				
				ceasar += (char) ('A' +( str.charAt(i) + key-'A')%26);
				}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<= 'z' &&str.charAt(i)+key-'a'>=26){
				
					ceasar += (char) ('a' +( str.charAt(i) + key-'a')%26);
					
			}
				else{
					ceasar += (char)str.charAt(i);
				}
			
		}
		return ceasar;
	}
	
	
	public static String reverseChiper(String str , int key){
		String ceasar = "";
		
		for (int i = 0; i < str.length(); i++) {
			
if(str.charAt(i) >= 'A' && str.charAt(i)<= 'Z' && str.charAt(i)+key-'A'>=26){
				
				ceasar += (char) ('A' +( str.charAt(i) + key-'A')%26);
				}
			else if(str.charAt(i) >= 'a' && str.charAt(i)<= 'z' &&str.charAt(i)+key-'a'>=26){
				
					ceasar += (char) ('a' +( str.charAt(i) + key-'a')%26);
					
			}
				else{
					ceasar += (char)str.charAt(i);
				}
			
		}
		return ceasar;

				
			
			
			
		}
	
    
	public static void main(String[] args) {
		
		String str;
		Scanner sc = new Scanner (System.in);
		Scanner sc1 = new Scanner (System.in);
		int key;
		System.out.println("Key giriniz:");
		key = sc.nextInt();
		
		
		System.out.println(key);
			
		System.out.println("Sifrelenecek mesajı giriniz");
		str = sc1.nextLine();
		String yeni = chiper(str,key);
		System.out.println("Şifrelendi");
		System.out.println(yeni);
		
		String decrypt = reverseChiper(yeni, key);
		System.out.println("Mesaj çözüldü");
		System.out.println(decrypt);
		
		
	}

}
