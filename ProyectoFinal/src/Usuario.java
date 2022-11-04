public class Usuario {

    private String nombre;
    private int edad;
    private String dni;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Usuario(String nombre, int edad, String dni) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
    }
    public Usuario(){}


    //para la validacion del Dni he decidido utilizar la funcion matches la cual nos dice si se cumple lo dicho por parametro
    //Si es valido el dni devolvera true si no lo es devolvera false
    public boolean esValido(String dni){

        return dni.replace("-", "").matches("^[0-9]{7,8}[T|R|W|A|G|M|Y|F|P|D|X|B|N|J|Z|S|Q|V|H|L|C|K|E]$");
        // los simbolos ^$ obligan a que empiecen de 'X' manera y terminen de 'Y' manera obligando al Usuario a hacerlo en el orden que dictaminemos

    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                '}';
    }
}
