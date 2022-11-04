import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.GregorianCalendar;

public class Cuenta {

    private double saldo;
    private Usuario usuario;
    private ArrayList gastos;
    private ArrayList ingresos;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ArrayList getGastos() {
        return gastos;
    }

    public void setGastos(ArrayList gastos) {
        this.gastos = gastos;
    }

    public ArrayList getIngresos() {
        return ingresos;
    }

    public void setIngresos(ArrayList ingresos) {
        this.ingresos = ingresos;
    }

    public Cuenta(Usuario usuario, double saldo) {
        this.usuario = usuario;
        this.saldo = saldo;
    }

    public Cuenta(){}


    public void addingresos(String descripcion, double cantidad){
        LocalTime d1 = LocalTime.now();
        String hora = String.valueOf(d1);
        LocalDate d2 = LocalDate.now();
        String dia = String.valueOf(d2);

        descripcion = "Ingreso realizado el: " + dia + " a la hora " + hora;



        setSaldo(cantidad);
        System.out.println("Operacion realizada con exito ");
        System.out.println(descripcion);

    }
    public void addgastos(String descripcion, double cantidad){
        LocalTime d1 = LocalTime.now();
        String hora = String.valueOf(d1);
        LocalDate d2 = LocalDate.now();
        String dia = String.valueOf(d2);

        descripcion = "Gasto realizado el: " + dia + " a la hora " + hora;



        double diferencia;

        if(cantidad > getSaldo()){

            System.out.println("No tienes suficiente saldo");

        }else{

            diferencia = getSaldo() -cantidad;
            setSaldo(diferencia);
            System.out.println("Operacion realizada con exito ");
            System.out.println(descripcion);
        }

    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", usuario=" + usuario +
                '}';
    }

    public static void main(String[] args) {
        String ciencia = "";
        Cuenta c1 = new Cuenta();

        c1.addingresos(ciencia,2000);
        c1.addgastos(ciencia,1000);

        System.out.println(c1.toString());
    }



}
