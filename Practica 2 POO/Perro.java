public class Perro extends Animal {
    
    private String raza;
    private boolean estaVacunado;

    // Constructor
    public Perro(String nombre, int edad, double peso, String raza, boolean estaVacunado) {
        super(nombre, edad, peso); // Llama al constructor de Animal
        this.raza = raza;
        this.estaVacunado = estaVacunado;
    }

    
    public void ladrar() {
        System.out.println(getNombre() + " dice: ¡Guau guau!");
    }

    public void buscarPelota() {
        System.out.println(getNombre() + " está buscando la pelota...");
    }

    
    @Override
    public String toString() {
        String vacunadoStr = estaVacunado ? "Sí" : "No";
        return super.toString() + String.format(" | Raza: %s | Vacunado: %s", raza, vacunadoStr);
    }
}