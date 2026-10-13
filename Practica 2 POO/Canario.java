public class Canario extends Animal {
    // Atributos propios
    private String colorPlumaje;
    private boolean cantaEnJaula;

   
    public Canario(String nombre, int edad, double peso, String colorPlumaje, boolean cantaEnJaula) {
        super(nombre, edad, peso);
        this.colorPlumaje = colorPlumaje;
        this.cantaEnJaula = cantaEnJaula;
    }

    
    public void cantar() {
        System.out.println(getNombre() + " está cantando: ♪ pi pi pi ♪");
    }

    public void volar() {
        System.out.println(getNombre() + " está volando libremente...");
    }

  
    @Override
    public String toString() {
        String jaulaStr = cantaEnJaula ? "Sí" : "No";
        return super.toString() + String.format(" | Plumaje: %s | Canta en jaula: %s", colorPlumaje, jaulaStr);
    }
}