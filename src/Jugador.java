public class Jugador {
    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;

    public Jugador(String nombre, int vida, int ataque, int defensa) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void recibirDanio(int danio) {
        vida -= danio;
        if (vida <= 0) {
            vida = 0;
            System.out.println("¡El jugador ha sido derrotado!");
        } else {
            System.out.println("El jugador ha recibido " + danio + " de daño. Vida restante: " + vida);
        }
    }

    public boolean isDead() {
        return vida <= 0;
    }
}