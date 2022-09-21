package DniProyecto;

import java.util.Scanner;

public class Nif {
	
	 private int dni;
	 private char letra;
	
	 public Nif() {
		 
	 }
	public Nif(int dni) {
		this.dni = dni;
		letra= calcularletra();
		
	}


	private char calcularletra() {
		
		char[]letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X',
                'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
	
		return letras[dni%23];
	}
	
	
	 public void leer() {
		Scanner sc = new Scanner(System.in);
		 do {
			 System.out.println("Introduce tu Dni: ");
			 dni= sc.nextInt();
			 
			 
		 }while(dni <=0);
		 
		 letra = calcularletra();
	
		 
	 }
	 
	 
	 

	@Override
	public String toString() {
		return "Nif [dni=" + dni + "-" + letra + "]";
	}
	
	
	
	
	
	public static void main(String[] args) {
		Nif nif1 = new Nif();
		nif1.leer();
		System.out.println(nif1);
		
		Nif nif2 = new Nif(34567892);
		System.out.println(nif2);

	}

}
