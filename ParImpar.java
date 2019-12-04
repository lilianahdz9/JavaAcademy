
//Exercise  
//Write a Java program 
//to determine whether an input number is an even number.
import java.util.Scanner;

public class ParImpar{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("cual ess tu numero: ");
		int numero = lector.nextInt();
		if(numero%2==0)
			System.out.println("este numero es par");
		else
			System.out.println("es impar");
		
	}
}	
