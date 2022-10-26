import java.util.Scanner;

public class Modulo {




    public void fraseUsu(String frase){

        for(int i = 0;i<frase.length();i++){

            System.out.print(frase.charAt(frase.length()-i-1));

        }

    }

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame una frase: ");
        String frase = teclado.nextLine();

        Modulo m1 = new Modulo();

        m1.fraseUsu(frase);


    }
}
