public class Enemigo {
    private String nombre;
    private int vida;

    public Enemigo(String nombre, int vida) {
        this.nombre = nombre;
        this.vida = vida;
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
            System.out.println("¡El enemigo ha sido derrotado!");
        } else {
            System.out.println("El enemigo ha recibido " + danio + " de daño. Vida restante: " + vida);
        }
    }

    public boolean isDead() {
        return vida <= 0;
    }
}