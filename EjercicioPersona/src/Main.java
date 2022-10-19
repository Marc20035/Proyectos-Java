import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Persona miguel = new Persona("miguel" , "madrid", LocalDate.of(1999,1,1));
        Persona miguel1 = new Persona("miguel" , "madrid", LocalDate.of(1999,1,1));
        Persona Jose = new Persona("jose","Salamanca",LocalDate.of(1965,1,1));
        Persona Luis = new Persona("luis","Avila",LocalDate.of(1930,1,1));

        miguel.setPadre(Jose);
        Jose.setPadre(Luis);

        System.out.println(Luis.toString());

        miguel.CalcuDif(Jose);

        System.out.println(miguel.equals(miguel1));
        System.out.println(miguel.equals(Jose));

        System.out.println(Jose);

        System.out.println("El numero de instancias son : " + Persona.numero);




    }
}