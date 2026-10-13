public class Gato extends Animal {
    // Atributos propios
    private String color;
    private boolean esInterior;

    
    public Gato(String nombre, int edad, double peso, String color, boolean esInterior) {
        super(nombre, edad, peso);
        this.color = color;
        this.esInterior = esInterior;
    }

    
    public void maullar() {
        System.out.println(getNombre() + " dice: ¡Miau!");
    }

    public void ronronear() {
        System.out.println(getNombre() + " está ronroneando...");
    }

    
    @Override
    public String toString() {
        String interiorStr = esInterior ? "Sí" : "No";
        return super.toString() + String.format(" | Color: %s | Interior: %s", color, interiorStr);
    }
}