public class Gasto extends Dinero{

    public Gasto(int tipo_dinero, String descripcion) {
        super(tipo_dinero, descripcion);
    }

    public Gasto() {
    }

    @Override
    public String toString() {
        return "Gasto{}";
    }
}
