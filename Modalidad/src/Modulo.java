import java.util.Scanner;

public class Modulo {

    public void fraseUsu(String frase){

        for (int i = 0; i < frase.length(); i++) {

            System.out.print(frase.charAt(frase.length()-i-1));
        }


    }

    public static void main(String[] args) {

        Modulo m1 = new Modulo();


        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame una Frase: ");
        String frase = teclado.nextLine();

        m1.fraseUsu(frase);
    }
}
