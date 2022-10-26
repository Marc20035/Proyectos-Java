public class Cafetera {

    private int _capacidadMaxima;
    private int _capacidadActual;

    public Cafetera(int _capacidadMaxima, int _capacidadActual) {
        this._capacidadMaxima = 100;
        this._capacidadActual = 0;
    }

    public Cafetera(int _capacidadActual) {
        this._capacidadMaxima = _capacidadActual;
    }
    public Cafetera(){
        if(_capacidadActual > _capacidadMaxima){
            _capacidadActual = _capacidadMaxima;
        }
    }

    public int get_capacidadMaxima() {
        return _capacidadMaxima;
    }

    public void set_capacidadMaxima(int _capacidadMaxima) {
        this._capacidadMaxima = _capacidadMaxima;
    }

    public int get_capacidadActual() {
        return _capacidadActual;
    }

    public void set_capacidadActual(int _capacidadActual) {
        this._capacidadActual = _capacidadActual;
    }

    public void llenarCafetera(){

        set_capacidadActual(get_capacidadMaxima());
        System.out.println("Su capacidad es: " + get_capacidadMaxima());

    }
    public void servirTaza(int cafe){
        int taza;
        taza = cafe;
        System.out.println("La cantidad ha sido insertada");

    }
    public void vaciarCafetera() {

        set_capacidadActual(0);
    }
    public void agregarCafe(int cafem){
        set_capacidadActual(cafem);


    }
}
