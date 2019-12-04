
import java.util.Scanner;

public class Divisibles{
	public static void main (String[] args) {
		
		Scanner lector = new Scanner(System.in);
	    System.out.println("hasta que numero quieres: ");
	    int numero = lector.nextInt();
		
	    int suma =0;
	for(int i=0;i<numero;i++){
		
		if(i%3==0 || i%5==0) {
			suma = (suma +i);
		}
	}
	System.out.println("la suma es: "+suma);
}
}
