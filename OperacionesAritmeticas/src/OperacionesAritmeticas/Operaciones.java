package OperacionesAritmeticas;

import java.util.Scanner;

public class Operaciones {
	
	
	double suma;
	double resta;
	double division;
	double multiplicacion;
	
	public double Opsuma (double num1, double num2) {
		
		
		suma = num1+num2;
		
		
		
		
		return suma;
	}
	public double Opresta (double num1, double num2) {
		
		
		resta = num1-num2;
		
		
		return resta;
	}
	public double OpMULTIPLICACION (double num1, double num2) {
		
		
		multiplicacion = num1*num2;
		
		
		return multiplicacion;
	}
	public double Opdivision (double num1, double num2) {
		
		
		division = num1/num2;
		
		
		return division;
	}
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		
		
		Operaciones opera = new Operaciones();
		
		
		double num1;
		double num2;
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dame el num1: ");
		
		num1 = sc.nextDouble();
		
		Scanner st = new Scanner(System.in);
		
		System.out.println("Dame el num2: ");
		
		num2 = st.nextDouble();
		
		
		System.out.println("El resultado de la operacion suma es: " + opera.Opsuma(num1,num2));
		System.out.println("El resultado de la operacion resta es: " + opera.Opresta(num1,num2));
		System.out.println("El resultado de la operacion multiplicacion es: " + opera.OpMULTIPLICACION(num1,num2));
		System.out.println("El resultado de la operacion division es: " + opera.Opdivision(num1,num2));
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
