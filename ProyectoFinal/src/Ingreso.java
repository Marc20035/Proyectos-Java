public class Ingreso extends Dinero{
    public Ingreso(int tipo_dinero, String descripcion) {
        super(tipo_dinero, descripcion);
    }

    public Ingreso() {
    }

    @Override
    public String toString() {
        return "Ingreso{}";
    }
}
