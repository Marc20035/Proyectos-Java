import java.util.Scanner;






public class Main {
    public static void main(String[] args) {

        int intentos = 0;
        //String descripcion = "";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = teclado.nextLine();

        Scanner edad1 = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        int edad = teclado.nextInt();

        Scanner dni1 = new Scanner(System.in);
        while (intentos < 3) {
            System.out.println("Introduce tu dni: ");
            String dni = dni1.nextLine();
            Usuario us1 = new Usuario(nombre,edad,dni);
            if(us1.esValido(dni)){
                System.out.println("Bienvenido al sistema");
                intentos = 3;

            }else{

                intentos++;
                System.out.println("te quedan: " + intentos);
            }




        }


       /* Usuario us1 = new Usuario(nombre,edad,dni);

        Cuenta c1 = new Cuenta(us1,1000);

        Scanner gasto1 = new Scanner(System.in);
        System.out.println("Cual ha sido el gasto: ");
        double gasto = gasto1.nextDouble();

        c1.addgastos(descripcion,gasto);

        Scanner ingreso1 = new Scanner(System.in);
        System.out.println("Cual va a ser el ingreso: ");
        double ingreso = ingreso1.nextDouble();

        c1.addingresos(descripcion,ingreso);

        System.out.println(c1.getGastos());
        System.out.println(c1.getIngresos());*/





    }
}