package Circulo;

import java.util.Scanner;

public class AreaCirculo {
	
	double radio;
	
	public void AreaResultante(double radio1) {
		
		radio1 = Math.PI * Math.pow(radio1,2);
		
		radio=radio1;
		
		System.out.println("El area del circulo es: " + radio);
		
	}
	

	

	public static void main(String[] args) {
		
		AreaCirculo p = new AreaCirculo();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el radio del circulo: ");
		double radio = sc.nextDouble();
		
		
		p.AreaResultante(radio);
		
	}

}
