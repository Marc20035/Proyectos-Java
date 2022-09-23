package ClaseJava;

public class Bicicleta {


    private int veocidadActual;
    private int platoActual;
    private int piñonActual;

    public int getVeocidadActual() {
        return veocidadActual;
    }

    public void setVeocidadActual(int veocidadActual) {
        this.veocidadActual = veocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        if(platoActual <0){

            System.out.println("No puede ser menor que 0");

        }
        this.platoActual = platoActual;
    }

    public int getPiñonActual() {
        return piñonActual;
    }

    public void setPiñonActual(int piñonActual) {
        if(piñonActual<0){

            System.out.println("El piñon no puede ser menos a 0");

        }else{
        this.piñonActual = piñonActual;}
    }

    public Bicicleta(int veocidadActual, int platoActual, int piñonActual) {
        this.veocidadActual = veocidadActual;
        this.platoActual = platoActual;
        this.piñonActual = piñonActual;
    }

    public void acelerar(){
        veocidadActual = veocidadActual *2;
        System.out.println(veocidadActual + " es tu velocidad Actual");
    }

    public void frenar(){
        veocidadActual = veocidadActual /2;
        System.out.println("Has frenado" + veocidadActual);


    }

    public void cambiarPlato(int plato){
        platoActual = plato;
        System.out.println("Tu plato actual es: " + plato);

    }
    public void cambiarPiñon(int piñon){
        piñonActual = piñon;
        System.out.println("Tu piñon actual es: " + piñon);
    }

    public static void main(String[] args) {



        Bicicleta miBicicleta = new Bicicleta(10 , 2 ,3);
        Bicicleta tuBicicleta = new Bicicleta(20, 4 , 2);

        miBicicleta.acelerar();
        tuBicicleta.acelerar();

        miBicicleta.frenar();
        tuBicicleta.frenar();

        miBicicleta.cambiarPiñon(-1);
        tuBicicleta.cambiarPiñon(2);

        miBicicleta.cambiarPlato(-3);
        tuBicicleta.cambiarPlato(3);

    }
}
