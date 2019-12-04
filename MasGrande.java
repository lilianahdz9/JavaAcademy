import java.util.Scanner;

public class MasGrande{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("cual es el primer numero: ");
        int numero1 = lector.nextInt();
        System.out.println("cual es el segundo numero: ");
        int numero2 = lector.nextInt();
        System.out.println("cual es el tercer numero: ");
        int numero3 = lector.nextInt();
        
        if(numero1 > numero2 &&  numero1 > numero3){
            System.out.println("el mayor es: "+numero1);
        }else if(numero2 > numero1 && numero2 > numero3){
                System.out.println("el mayor es: "+numero2);
        }else if(numero3 > numero1 && numero3 > numero2){
                    System.out.println("el mayor es: "+numero3);
        }
		
	}
}