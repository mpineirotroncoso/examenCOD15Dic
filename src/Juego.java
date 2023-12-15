import java.util.Scanner;

public class Juego {
    /**
     * Iniciar el juego
     */
    public static void IniciarJuego () {
        System.out.println("a");
        Scanner sc = new Scanner(System.in);
        Datos unicaInstancia = Datos.getInstance();
        System.out.println("Introduce tu alias: ");
        unicaInstancia.setAlias(sc.nextLine());
        unicaInstancia.setRondas(10);
        unicaInstancia.setMaxIntentos(2);
        unicaInstancia.generarNumeroAleatorio();


        for (int i = 0; i < unicaInstancia.getMaxIntentos(); i++) {
            System.out.println("Intenta adivinar el numero: ");
            if (unicaInstancia.compararNumero(sc.nextInt())) {
                System.out.println("Adivinaste el Numero!");
                return;
            } else {
                System.out.println("Numero incorrecto!");
            }
        }
        System.out.println("No te quedan mas intentos, el numero era: "+unicaInstancia.getNumAleatorio()+". Saliendo...");
    }

}
