import java.util.Scanner;

public class Juego {
    public static void main (String[] args) {
        Datos unicaInstancia = Datos.getInstance();
        unicaInstancia.setAlias("Marcos");
        unicaInstancia.setRondas(10);
        unicaInstancia.setMaxIntentos(2);
    }
}
