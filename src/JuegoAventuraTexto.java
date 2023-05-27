import java.util.Scanner;

public class JuegoAventuraTexto {
    private static final int valorAtributoMaximo = 10;
    private static final int vidaInicial = 5;
    private static final int vidaMinima = 0;

    private static int vidaJugador;
    private static Scanner scannerRPG;
    private static GestorMisiones gestorMisiones;

    public static void main(String[] args) {
        scannerRPG = new Scanner(System.in);
        gestorMisiones = new GestorMisiones(); // Instanciar el GestorMisiones

        crearPersonaje();
        iniciarJuego();
        scannerRPG.close();
    }

    private static void crearPersonaje() {
        System.out.println("Bienvenidos al mundo de Ornalis");
        System.out.println("¿Cuál es tu nombre, aventurero?: ");
        String nombreJugador = scannerRPG.nextLine();

        System.out.println("Bienvenido, " + nombreJugador + "!");
        vidaJugador = vidaInicial;
        System.out.println("Tu vida inicial es: " + vidaJugador);
    }

    private static void iniciarJuego() {
        System.out.println("\nSelecciona una opción: ");
        System.out.println("1. Realizar misión");
        System.out.println("2. Descansar");
        System.out.println("3. Salir del juego");
        System.out.println("Ingresa tu opción: ");

        int option = scannerRPG.nextInt();

        switch (option) {
            case 1:
                gestorMisiones.realizarMision(); // Llamar al método realizarMision() del GestorMisiones
                break;
            case 2:
                descansar();
                break;
            case 3:
                salirJuego();
                break;
            default:
                System.out.println("Opción inválida. Intente nuevamente.");
        }
    }


    private static void descansar() {
        // Lógica para descansar
    }

    private static void salirJuego() {
        System.out.println("\nJuego finalizado");
        System.exit(0); // Salir del programa
    }
}
