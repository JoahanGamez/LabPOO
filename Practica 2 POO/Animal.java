public class Animal {
   
    private String nombre;
    private int edad;
    private double peso;

    
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }

   
    public void comer() {
        System.out.println(this.nombre + " está comiendo.");
    }

    public void dormir() {
        System.out.println(this.nombre + " está durmiendo.");
    }

    
    public String getNombre() {
        return this.nombre;
    }

    
    @Override
    public String toString() {
        return String.format("Nombre: %s | Edad: %d años | Peso: %.2f kg", nombre, edad, peso);
    }
}