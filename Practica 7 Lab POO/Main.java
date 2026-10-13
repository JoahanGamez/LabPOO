public class Main {
    public static void main(String[] args) {
        System.out.println("=== RPG — Sistema con Manejo de Excepciones ===");

        Druida druida = new Druida("Sylva", 7, 200, 180, 120, "Lobo");
        Nigromante nigromante = new Nigromante("Malachar", 6, 200, 220, 15);
        MotorCombate motor = new MotorCombate();

        // Escenario 1 - Turno normal
        motor.ejecutarTurno(druida, nigromante);

        // Escenario 2 - Personaje derrotado intenta atacar
        try {
            druida.recibirDanio(9999);
        } catch (AccionInvalidaException e) {
            System.out.println(e.getMessage());
        }
        motor.ejecutarTurno(druida, nigromante);

        // Escenario 3 - Arquero sin flechas
        Arquero sinFlechas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        motor.ejecutarTurno(sinFlechas, nigromante);

        // Escenario 4 - Curar aliado derrotado
        System.out.println("\n-- Intento de curar aliado derrotado --");
        Druida druida2 = new Druida("Elara", 5, 100, 50, 50, "Oso");
        try {
            druida2.curarAliado(druida); // 'druida' ya fue derrotado en el Escenario 2
        } catch (RpgException e) {
            System.out.println("No se pudo curar: " + e.getMessage());
        }

        // Escenario 5 - Daño negativo
        System.out.println("\n-- Bloque manual try-catch-finally --");
        try {
            nigromante.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        // Escenario 6 - Mostrar bitácora
        motor.mostrarBitacora();
    }
}