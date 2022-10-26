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

    public void validacion(String usuario,String contraseña){

        if(usuario.length()<8 || contraseña.length()<8){

            System.out.println("La contraseña o el usuario son incorrectas");

        }else{

            System.out.println("Todo correcto Bienvenido al Sistema");


        }


    }

    public static void main(String[] args) {
        Reutilizacion a1 = new Reutilizacion("Hola","Informatica");
        Reutilizacion a2 = new Reutilizacion("Usuariolargo","User123");
        Reutilizacion a3 = new Reutilizacion("Usuariolargo","User1234");
        Reutilizacion a4 = new Reutilizacion("User","Pass");


        a1.validacion(a1.getUsuario(), a1.getContraseña());
        a2.validacion(a2.getUsuario(), a2.getContraseña());
        a3.validacion(a3.getUsuario(), a3.getContraseña());
        a4.validacion(a4.getUsuario(), a4.getContraseña());

    }

}
