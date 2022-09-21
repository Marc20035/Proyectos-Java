package Triangulo;

import java.util.Scanner;

public class LadosTriangulo {

	
	double lado1;
	double lado2;
	double lado3;
	
	
	public void CualEsMasGrande(double num1,double num2,double num3) {
		
		if(num1>num2 && num1>num3) {
			
			System.out.println("El lado 1 y mide " + num1 + " es el mayor.");
			System.out.println("No es Equilatero");
			
		}else if(num2>num1 && num2>num3) {
			
			System.out.println("El lado 2 y mide " + num2 + " es el mayor.");
			System.out.println("No es Equilatero");
		}else if(num3>num1 && num3>num2) {
			
			System.out.println("El lado 3 y mide " + num3 + " es el mayor.");
			System.out.println("No es Equilatero");
		}else {
			
			System.out.println("Es un triangulo Equilatero");
			
		}
		
		
	}
	
	public static void main(String[] args) {
		LadosTriangulo a = new LadosTriangulo();
		double lado1;
		double lado2;
		double lado3;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe un lado del triangulo: ");
		lado1 = sc.nextDouble();
		Scanner st = new Scanner(System.in);
		System.out.println("Escribe un lado del triangulo: ");
		lado2 = st.nextDouble();
		Scanner sm = new Scanner(System.in);
		System.out.println("Escribe un lado del triangulo: ");
		lado3 = sm.nextDouble();
		
		a.CualEsMasGrande(lado1, lado2, lado3);
		
	}
	
	
	
	
	
	
	
	
	
}
