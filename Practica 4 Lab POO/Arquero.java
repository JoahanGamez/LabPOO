public class Arquero extends Personaje {
    private int precision;
    private String tipoArco;

    public Arquero(String nombre, int nivel, int puntosVida, int precision, String tipoArco) {
        super(nombre, nivel, puntosVida);
        this.precision = precision;
        this.tipoArco = tipoArco;
    }

    public int getPrecision() { return precision; }
    public String getTipoArco() { return tipoArco; }

    @Override
    public void atacar() {
        // El arquero sobreescribe el ataque por completo, sin usar super.atacar()
        System.out.println("[" + getNombre() + "] dispara una flecha con precisión del " + precision + "%.");
    }

    @Override
    public void defender() {
        System.out.println(getNombre() + " se desplaza ágilmente esquivando el ataque.");
    }
}