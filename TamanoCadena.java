//Excercise
// Given a string, return the string made of its first two chars, 
// so the String "Hello" yields "He". 
// If the string is shorter than length 2, return whatever there is, 
// so "X" yields "X", and the empty string "" 
// yields the empty string "". Note that str.length() 
// returns the length of a string.

import java.util.Scanner;

public class TamanoCadena{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("cual es la cadena a analizar: ");
		String cadenaOriginal = lector.nextLine();
		if(cadenaOriginal.length() < 2 ){
			System.out.println(cadenaOriginal);
		}else if (cadenaOriginal == " "){
			System.out.println(" ");
		}else{
			System.out.println(cadenaOriginal.substring(0,2));
		}
		
	}
}