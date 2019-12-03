import java.util.Scanner;

public class pinito {
	public static void main(String[] args) {
	Scanner lector = new Scanner(System.in);
	
	
    System.out.println("filas: ");
    int filas = lector.nextInt();
	
    
    for(int i=filas;i>0;i--){
		for(int j=0;j<=i;j++){
    	System.out.print("*");
		}	
		System.out.println(" ");
    }
	
	}
}