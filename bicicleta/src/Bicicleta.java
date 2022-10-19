import java.util.Scanner;

public class Bicicleta {

    private int VelocidadActual;
    private int PlatoActual;
    private int PiñonActual;

    public int getVelocidadActual() {
        return VelocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        VelocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return PlatoActual;
    }

    public void setPlatoActual(int platoActual) {
        PlatoActual = platoActual;
    }

    public int getPiñonActual() {
        return PiñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        PiñonActual = piñonActual;
    }

    public Bicicleta(int velocidadActual, int platoActual, int piñonActual) {
        VelocidadActual = velocidadActual;
        PlatoActual = platoActual;
        PiñonActual = piñonActual;
    }

   public Bicicleta(){
        VelocidadActual = 0;
        PlatoActual =1;
        PiñonActual = 1;

   }

    public void Acelerar(){

        int x;
        x=getVelocidadActual()*2;

        System.out.println("Su velocidad a aumentado a " + x);
    }

    public void frenar(){
        int x;
        x= getVelocidadActual()/2;
        System.out.println("Su velocidad a disminuido a " + x);
    }

    public int cambiarPlato(int plato){

        setPlatoActual(plato);
        System.out.println("Su plato actual es: " + getPlatoActual());
        return 0;
    }

    public int cambiarPiñon(int piñon){
        setPiñonActual(piñon);
        System.out.println("El piñon a cambiado a: " + getPiñonActual());
        return 0;
    }
    public void vaciarPlato(){
        setPlatoActual(1);
        System.out.println("Su plato actual es:  " + getPlatoActual());
    }
    public void vaciarPiñon(){
        setPiñonActual(1);
        System.out.println("El Piñon a cambiado a:  " + getPiñonActual());
    }

    @Override
    public String toString() {
        return "Bicicleta{" +
                "VelocidadActual=" + VelocidadActual +
                ", PlatoActual=" + PlatoActual +
                ", PiñonActual=" + PiñonActual +
                '}';
    }

    public static void main(String[] args) {
        Bicicleta mibicicleta = new Bicicleta(10,3,4);
        Bicicleta tubicleta = new Bicicleta(0,0,0);
        Bicicleta elbicicleta = new Bicicleta();


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el Piñon que quieras: ");
        int piñon_nuevo = sc.nextInt();

        Scanner sm = new Scanner(System.in);
        System.out.println("Introduce el Plato que quieras: ");
        int plato_nuevo = sm.nextInt();

        mibicicleta.Acelerar();
        mibicicleta.frenar();
        mibicicleta.vaciarPiñon();
        mibicicleta.vaciarPlato();

        System.out.println(mibicicleta.toString());

        System.out.println(elbicicleta.toString());



        tubicleta.cambiarPiñon(piñon_nuevo);
        tubicleta.cambiarPlato(plato_nuevo);

        System.out.println(tubicleta.toString());
    }


}
