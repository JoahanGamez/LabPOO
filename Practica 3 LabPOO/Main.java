public class Main {
    public static void main(String[] args) {
        System.out.println("=== Sistema de Transporte Multimodal ===\n");

        // Creación de objetos
        Automovil auto = new Automovil("Toyota", "Corolla", 2022, 180.0, 4, false);
        Avion avion = new Avion("Boeing", "737", 2019, 850.0, "Aeroméxico", 35000.0);
        Barco barco = new Barco("Ferretti", "550", 2020, 45.0, 17.5, "Fibra de vidrio");

        // Imprimir estado inicial
        System.out.println("-- Automovil --");
        System.out.println(auto.toString() + "\n");

        System.out.println("-- Avion --");
        System.out.println(avion.toString() + "\n");

        System.out.println("-- Barco --");
        System.out.println(barco.toString() + "\n");

        // Pruebas de validación (errores intencionales)
        System.out.println("--- Probando validaciones ---");
        auto.setAnio(1800);        // Error: año no válido.
        auto.setNumPuertas(10);    // Error: número de puertas no válido.
        avion.setAltitudMaxima(-500); // Error intencional en avión
        barco.setEslora(0);           // Error intencional en barco

        // Corregir valores con datos válidos
        System.out.println("\n--- Corrigiendo con datos válidos ---");
        auto.setAnio(2023);
        auto.setNumPuertas(2);
        
        // Imprimir los datos del auto actualizados
        System.out.println("\n-- Automovil (Actualizado) --");
        System.out.println(auto.toString());
    }
}