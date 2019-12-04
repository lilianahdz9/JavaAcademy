// write java program to allow the user to input two integer values
// and then the program prints the results of adding,
// subtracting, multiplying, and dividing among the two values



import java.util.Scanner; 

public class Operaciones{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		
		System.out.println("indica el primer numero: ");
		int numero1 = lector.nextInt();
		
		System.out.println("indica el segundo numero: ");
		int numero2 = lector.nextInt();
		
		int suma = numero1 + numero2;
		int resta = numero1 - numero2;
		int multiplicacion = numero1 * numero2;
		int division = numero1 / numero2;
		
		System.out.println("la suma de " + numero1 + "+" + numero2+ " es: "+ suma+
			"\nla resta de " + numero1 + "-" + numero2+ " es: "+ resta + 
			"\nla multi de " + numero1 + "X" + numero2+ " es: "+ multiplicacion+
			"\nla divi de " + numero1 + "/" + numero2+ " es: "+ division);
	}
}
