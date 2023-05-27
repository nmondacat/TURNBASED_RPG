import java.util.Random;

public class SistemaCombate {
    public static final int VIDA_ENEMIGO_MAX = 100;
    public static final int DANIO_MAX = 20;

    private static final Random random = new Random();

    public static void main(String[] args) {
        Jugador jugador = new Jugador("Jugador", 100, 10, 5);
        Enemigo enemigo = enemigoSlime();

        System.out.println("¡Comienza la batalla!");

        while (!jugador.isDead() && !enemigo.isDead()) {
            System.out.println("----- Turno del Jugador -----");
            jugadorAtaqueNormal(jugador, enemigo);

            if (enemigo.isDead()) {
                break;
            }

            System.out.println("----- Turno del Enemigo -----");
            enemigoSlime(enemigo, jugador);
        }

        System.out.println("¡Fin de la batalla!");
    }

    public void iniciarCombate(Jugador jugador, Enemigo enemigo) {
        System.out.println("¡Comienza la batalla!");

        while (!jugador.isDead() && !enemigo.isDead()) {
            System.out.println("----- Turno del Jugador -----");
            jugadorAtaqueNormal(jugador, enemigo);

            if (enemigo.isDead()) {
                break;
            }

            System.out.println("----- Turno del Enemigo -----");
            enemigoSlime(enemigo, jugador);
        }

        System.out.println("¡Fin de la batalla!");
    }

    private static void jugadorAtaqueNormal(Jugador jugador, Enemigo enemigo) {
        int successChance = random.nextInt(100);

        if (successChance < 80) {
            int damage = random.nextInt(DANIO_MAX) + 1;
            enemigo.recibirDanio(damage);
        } else {
            System.out.println("¡El jugador falla al intentar realizar el ataque normal!");
        }
    }

    private static void enemigoSlime(Enemigo enemigo, Jugador jugador) {
        int randomChance = random.nextInt(100);

        if (randomChance < 50) {
            habilidadSlime(enemigo, jugador);
        } else {
            enemigoType5NormalAttack(enemigo, jugador);
        }
    }

    private static void habilidadSlime(Enemigo enemigo, Jugador jugador) {
        System.out.println("El Slime lanza la habilidad A.");

        int successChance = random.nextInt(100);

        if (successChance < 70) {
            int damage = random.nextInt(DANIO_MAX) + 1;
            jugador.recibirDanio(damage);
        } else {
            System.out.println("¡El Slime falla al intentar lanzar la habilidad!");
        }
    }

    private static Enemigo enemigoSlime() {
        return new Enemigo("Slime", VIDA_ENEMIGO_MAX);
    }

    private static void enemigoType5NormalAttack(Enemigo enemigo, Jugador jugador) {
        int damage = random.nextInt(DANIO_MAX) + 1;
        jugador.recibirDanio(damage);
    }
}