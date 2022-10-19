public class Cuenta {

    private String nombre;
    private String numero_cuenta;
    private double interes;
    private double saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumero_cuenta() {
        return numero_cuenta;
    }

    public void setNumero_cuenta(String numero_cuenta) {
        this.numero_cuenta = numero_cuenta;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cuenta(String nombre, String numero_cuenta, double interes, double saldo) {
        this.nombre = nombre;
        this.numero_cuenta = numero_cuenta;
        this.interes = interes;
        this.saldo = saldo;
    }
    public Cuenta(){}

    public void ingreso(double saldo){
        double suma=0;
            suma = getSaldo() + saldo;
            System.out.println("True y su saldo actual es: " + suma);
    }
    public void reintegro(double saldo){
        double diferencia = 0;
        if(getSaldo()>0){

            diferencia=getSaldo()-saldo;
            if(diferencia<0){
                System.out.println("Debe dinero al banco y su saldo actual es: " + diferencia);

            }else{
                System.out.println( "Su saldo es de: " + diferencia);

            }


        }else{

            System.out.println("No tienes dinero en la cuenta ");
        }


    }

    public static void main(String[] args) {
        Cuenta cs = new Cuenta("Pedro","1234",12,60);
        Cuenta cm = new Cuenta("Luis","1234",12,-3);

        cs.ingreso(20);
        cm.ingreso(20);


        cs.reintegro(61);
        cm.reintegro(98);
    }


}
