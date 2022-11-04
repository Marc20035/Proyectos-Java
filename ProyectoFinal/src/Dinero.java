public class Dinero {

    private int tipo_dinero;

    private String descripcion;

    public int getTipo_dinero() {
        return tipo_dinero;
    }

    public void setTipo_dinero(int tipo_dinero) {
        this.tipo_dinero = tipo_dinero;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Dinero(int tipo_dinero, String descripcion) {
        this.tipo_dinero = tipo_dinero;
        this.descripcion = descripcion;
    }
    public Dinero(){}

}
