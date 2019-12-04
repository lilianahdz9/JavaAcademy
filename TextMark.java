// Create a JAVA program to display the "text mark" corresponding to a certain "numerical mark", 
//using the following equivalence: 

// 9,10 = Sobresaliente 
// 7,8 = Notable 
// 6 = Bien 
// 5 = Aprobado 
// 0-4 = Suspenso 

// Your program must ask the user for a numerical mark and display the corresponding text mark. 
// You must do it twice: first using "if" and then using "switch".

import java.util.Scanner;

public class TextMark{
	public static void main(String[] args){
		Scanner lector = new Scanner(System.in);
		System.out.println("dame el numero: ");
        int numero = lector.nextInt();
        // if(numero==10 || numero ==9){
        //     System.out.println("sobresaliente");
        // } else if(numero==8 || numero ==7){
        //         System.out.println("notable");
        // } else if(numero==6){
        //             System.out.println("bien");
        // }else if(numero == 5){
        //                 System.out.println("aprobado");
        // }else if(numero==4 || numero ==3 || numero ==2 || numero ==1 || numero ==0){
        //     System.out.println("suspenso");
        // }
        switch(numero){
            case 10: case 9:
                System.out.println("sobresaliente");
                break;
            case 8: case 7:
                System.out.println("notable");
                break;
            case 6:
                System.out.println("bien");
                break;
            case 5:
                System.out.println("aprobado");
                break;
            case 4: case 3: case 2: case 1: case 0:
                System.out.println("suspenso");
                break;

        }
		
	}
}