package ejecutable;
import modelo.Equipo;
import modelo.Jugador;

public class Ejecutable 
{
    public static void main(String[] args)
    {
        Jugador E = new Jugador();
        E.setNombre(" Juan");
        E.setGoles(4);
        System.out.println(E);
        //System.out.println("el nombre es: " + E.getNombre() + " los goles que ha metido son : " + E.getGoles());
            
        Equipo equi= new Equipo("", 0);
        equi.crearJugador();
        equi.calcularTotalGoles();
        System.out.println("el jugador creado es " + equi.crearJugador() + " los goles que ha metido son : " + equi.calcularTotalGoles());
            

    
    }
    
}
    

    

