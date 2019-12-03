//Excercise
// Given a string, return the string made of its first two chars, 
// so the String "Hello" yields "He". 
// If the string is shorter than length 2, return whatever there is, 
// so "X" yields "X", and the empty string "" 
// yields the empty string "". Note that str.length() 
// returns the length of a string.

import java.util.Scanner;

public class Substring{
	public static void main(String[] args){
		
		Scanner lector = new Scanner(System.in);
		System.out.println("cual es la cadena: ");
		String cadenaOriginal= lector.nextLine();
		
		
		if(cadenaOriginal.length() <2){
			System.out.println(cadenaOriginal);
		}else{
			
			String subcadena = cadenaOriginal.substring(0,2);
			System.out.println("la cadena es: "+subcadena);
		}
	}
}

//INVESTIGA SUBSTRING EN https://docs.oracle.com/javase/8/docs/api/