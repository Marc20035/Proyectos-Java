import java.time.LocalDate;

public class Persona {

    private String nombre;
    private String ciudad;
    private LocalDate fechadenacimiento;
    private Persona padre;
    private Persona madre;

    public static int numero = 0;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public LocalDate getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(LocalDate fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }

    public Persona getPadre() {
        return padre;
    }

    public void setPadre(Persona padre) {
        this.padre = padre;
    }

    public Persona getMadre() {
        return madre;
    }

    public void setMadre(Persona madre) {
        this.madre = madre;
    }

    public Persona(String nombre, String ciudad, LocalDate fechadenacimiento) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.fechadenacimiento = fechadenacimiento;
        numero++;
    }

    public Persona(String nombre) {
        this.nombre = nombre;
        numero++;
    }

    public void CalcuDif(Persona persona){

        int diferencia = 0;

        if(persona.fechadenacimiento.isAfter(fechadenacimiento)){

            diferencia = persona.fechadenacimiento.getYear() - getFechadenacimiento().getYear();

        }else{

            diferencia = getFechadenacimiento().getYear() - persona.fechadenacimiento.getYear();

        }
        System.out.println("Los años que se llevan son: " + diferencia);


    }
    public void MostrarInstancias(){

        System.out.println(numero);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return nombre.equals(persona.nombre) && fechadenacimiento.equals(persona.fechadenacimiento);
    }


    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", fechadenacimiento=" + fechadenacimiento +
                ", padre=" + padre +
                '}';
    }





}
