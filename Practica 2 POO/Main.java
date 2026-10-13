public class Main {
    public static void main(String[] args) {
        System.out.println("=== Clínica Veterinaria ===\n");

        // --- Creación del objeto Perro ---
        Perro miPerro = new Perro("Max", 3, 12.5, "Labrador", true);
        System.out.println("-- Perro --");
        System.out.println(miPerro.toString());
        miPerro.comer();         
        miPerro.ladrar();        
        miPerro.buscarPelota(); 
        System.out.println();

        // --- Creación del objeto Gato ---
        Gato miGato = new Gato("Misi", 2, 3.8, "Gris", true);
        System.out.println("-- Gato --");
        System.out.println(miGato.toString());
        miGato.dormir();         
        miGato.maullar();        
        miGato.ronronear();      
        System.out.println();

        // --- Creación del objeto Canario ---
        Canario miCanario = new Canario("Pico", 1, 0.03, "Amarillo", true);
        System.out.println("-- Canario --");
        System.out.println(miCanario.toString());
        miCanario.comer();       
        miCanario.cantar();      
        miCanario.volar();      
    }
}