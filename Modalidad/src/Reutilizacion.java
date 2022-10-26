import java.util.Scanner;

public class Reutilizacion {
        String usuario;
        String contraseña;


        public Reutilizacion(String usuario, String contraseña) {
            this.usuario = usuario;
            this.contraseña = contraseña;
        }

        public String getUsuario() {
            return usuario;
        }

        public void setUsuario(String usuario) {
            this.usuario = usuario;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public boolean validacion(Object a) {


                 if (getUsuario().length() < 8 || getContraseña().length() < 8) {
                     System.out.println("La contraseña o el usuario son incorrectas");
                     return false;

                 } else {
                     System.out.println("Todo correcto Bienvenido al Sistema");
                     return true;


                 }




        }




        public static void main(String[] args) {

            int contador = 1;
            do {
                Scanner teclado = new Scanner(System.in);
                System.out.println("Dame el nombre de usuario");
                String nombre = teclado.nextLine();

                Scanner teclado1 = new Scanner(System.in);
                System.out.println("Dame la contraseña: ");
                String contraseña = teclado1.nextLine();

                Reutilizacion a1 = new Reutilizacion(nombre,contraseña);

                if(a1.validacion(a1)==true ){
                    if (contador == 1) {

                        break;

                    } else if (contador == 2) {
                        break;
                    }


                }else{

                    contador++;
                }
                System.out.println("Te quedan: " + (4-contador) + " intentos");

            }while (contador<=3);




        }

    }
