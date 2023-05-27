import java.util.Random;

public class GestorMisiones {

    private static final Random azarMisiones = new Random();
    private static final SistemaCombate sistemaCombate = new SistemaCombate(); // Instancia de la clase SistemaCombate

    public static void realizarMision() {
        int evento = azarMisiones.nextInt(5);

        switch (evento) {
            case 0:
                eventoTesoro();
                break;
            case 1:
                eventoEnemigo();
                break;
            case 2:
                eventoNPC();
                break;
            case 3:
                eventoObstaculo();
                break;
            case 4:
                eventoObjetoMisterioso();
                break;
            default:
                break;
        }
    }

    private static void eventoEnemigo() {
        int enemyLife = azarMisiones.nextInt(SistemaCombate.VIDA_ENEMIGO_MAX) + 1;
        System.out.println("¡Has encontrado un enemigo! ¡Prepárate para el combate!");
        sistemaCombate.iniciarCombate(new Jugador("Jugador", 100, 10, 5), new Enemigo("Enemigo", enemyLife));
    }

    private static void eventoTesoro() {
        System.out.println("Explorando, has encontrado un tesoro! ¡Obtienes un objeto valioso! :");
        String[] valuableItems = {"Palo Legandario", "Poción de curación", "Amuleto de protección", "Escudo elemental", "Guantes de hierro"};
        int randomIndex = azarMisiones.nextInt(valuableItems.length);
        String itemObtained = valuableItems[randomIndex];
        System.out.println("Has obtenido: " + itemObtained);
    }

    private static void eventoNPC() {
        System.out.println("¡Has encontrado a un NPC amigable! Te ofrece una misión secundaria.");

        // Generar una misión secundaria aleatoria
        String[] misiones = {
                "Recoge 10 hierbas medicinales y entrégalas al NPC.",
                "Derrota al jefe del calabozo y recupera el tesoro perdido.",
                "Encuentra la ubicación secreta y descubre el tesoro oculto.",
                "Reúne información sobre los enemigos y compártela con el NPC."
        };

        // Seleccionar una misión aleatoria
        int indiceMision = (int) (Math.random() * misiones.length);
        String mision = misiones[indiceMision];

        System.out.println("El NPC te ha dado la siguiente misión: " + mision);
        // Lógica adicional para almacenar la misión en la lista de misiones del jugador, por ejemplo.
    }

    private static void eventoObstaculo() {
        System.out.println("¡Has encontrado un obstáculo! Debes resolver un acertijo para continuar.");
        // Lógica para un acertijo o desafío que el jugador debe resolver
    }

    private static void eventoObjetoMisterioso() {
        System.out.println("¡Has encontrado un objeto misterioso! ¿Quieres investigarlo?");
        // Lógica para interactuar con un objeto misterioso
    }
}