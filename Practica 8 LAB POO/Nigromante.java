public class Nigromante extends Personaje implements Hechicero {
    private int mana;
    private int almasAbsorbidas;

    public Nigromante(String nombre, int nivel, int puntosVida, int mana, int almasAbsorbidas) {
        super(nombre, nivel, puntosVida);
        this.mana = mana;
        this.almasAbsorbidas = almasAbsorbidas;
    }

    @Override
    public void atacar() throws RpgException {
        if (!isEstaVivo()) throw new PersonajeDerrotadoException(getNombre());
        if (mana < 15) throw new RecursoInsuficienteException("mana", mana);
        
        mana -= 15;
        System.out.println("[" + getNombre() + "] drena la esencia vital.");
    }

    @Override
    public int calcularDanio() { return (nivel * 50) + (almasAbsorbidas * 6); }
    
    @Override
    public void lanzarHechizo() throws RpgException { /* Lógica de hechizo */ }
    @Override
    public int getMana() { return mana; }
}