public class Usuario {

    String usuario;
    String contraseña;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    public Usuario(){}

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


    public void validacion(String contraseña,String usuario){
       if(usuario.length() >= 8 || contraseña.length() >= 8){
            System.out.println("La contraseña o el usuario de " + getUsuario() + " son incorrectas");
        }else {
        System.out.println("Usuario y contraseña corrcetas");}




    }

    public static void main(String[] args) {

        Usuario a1 = new Usuario("Hola","Informatica");
        a1.validacion(a1.usuario, a1.contraseña);
        Usuario a2 = new Usuario("UsuarioLargo","User123");
        a2.validacion(a2.usuario,a2.contraseña);
        Usuario a3 = new Usuario("UsuarioLargo","User1234");
        a3.validacion(a3.usuario,a3.contraseña);
        Usuario a4 = new Usuario("User","pass");
        a1.validacion(a4.usuario,a4.contraseña);


    }

}
