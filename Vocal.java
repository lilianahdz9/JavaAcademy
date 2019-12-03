public class Vocal{
	public static void main(String[] args){
		
		String cadena = args[0];
		int longitudCadena = cadena.length(); //es mejor eso para que en la iteracion no lo pregunte a cada rato
		int i = 0;
		
		
		// while (i< longitudCadena){
			// if(cadena.charAt(i) == 'a' ||
			 // cadena.charAt(i) == 'e' ||
			 // cadena.charAt(i) == 'i' ||
			 // cadena.charAt(i) == 'o' ||
			 // cadena.charAt(i) == 'u' ){
				// System.out.println("tiene vocales");
				// break;
			// }else{
				// System.out.println("no tiene vocales chaval");
			// }
			// i++;
		// }
		
		
		
		
		
		
		do{
			if(cadena.charAt(i) == 'a' ||
			 cadena.charAt(i) == 'e' ||
			 cadena.charAt(i) == 'i' ||
			 cadena.charAt(i) == 'o' ||
			 cadena.charAt(i) == 'u' ){
				System.out.println("tiene vocales");
				break;
			}
			i++;
		}
		while(i< longitudCadena);
	}
}
