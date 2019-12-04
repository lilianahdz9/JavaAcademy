// Excercise
// Write a do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. 
// The loop should ask the user whether he or she wishes to perform the operation again. If so, the loop should repeat; 
// otherwise it should terminate.
import java.util.Scanner;

public class TryAgain{
	public static void main(String[] args){
        Scanner lector = new Scanner(System.in);
        do{
		System.out.println("dame el primer numero: ");
        int numero1 = lector.nextInt();
        System.out.println("dame el segundo numero: ");
        int numero2 = lector.nextInt();
        int suma = numero1 + numero2; 
        System.out.println("la suma es: "+suma);

        System.out.print("lo quiere intentar de nuevo? (1)si  (2)no");
        int respuesta = lector.nextInt();
        } while ( respuesta == 1 );
	}
}