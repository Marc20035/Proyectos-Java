package Ejercicio4;

import java.util.Iterator;
import java.util.Scanner;

public class Ejercicio4 {
	
	
	public void CalcularDigitos(int numero) {
		
		System.out.println("Tu numero consta de: " + Integer.toString(numero).length() + " numeros");
			
			
			
		}
		
		
		

	
	
	
	
	
	

	public static void main(String[] args) {
		
		Ejercicio4 a = new Ejercicio4();
		int numero;
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el numero que quieras: ");
		    numero = sc.nextInt();
		    a.CalcularDigitos(numero);
			
			if (numero < 0 ) {
				
				System.out.println("Tiene que ser un numero > que  0 ");
				
			}
			
		}while(numero != 0);
		
	
		

	}

}
