package Ejercicio5;

import java.util.Scanner;


public class MediaNum {

	

	public static void main(String[] args) {
		MediaNum a = new MediaNum();
		int numero;
		
		int acumulador = 0;
		
		int contador= 0;
		
		do{
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce los numeros que quieras: ");
		    numero = sc.nextInt();
		    acumulador = acumulador + numero;
		    contador = contador +1;
			
			if (numero < 0 ) {
				
				System.out.println("Tiene que ser un numero > que  0 ");
				
			}
			
		}while(numero != 0);
		
		System.out.println("la media aritmetica es: " + (acumulador/contador));
	}



}
