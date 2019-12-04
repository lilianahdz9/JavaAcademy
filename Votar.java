import java.util.Scanner;
public class Votar{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("cual es tu edad: ");
        int edad = lector.nextInt();
        if(edad >= 18)
            System.out.println("puedes votar");
            else
                System.out.println("aun no puedes votar");
	}
}