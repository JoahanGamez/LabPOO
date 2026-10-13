public class Main {
    public static void main(String[] args) {
        
       
        
        Druida druida = new Druida("Sylva", 7, 200, 180, 120, "Lobo");
        Nigromante nigromante = new Nigromante("Malachar", 6, 300, 220, 15);
        MotorCombate motor = new MotorCombate();

        // 1. Turno normal sin excepción
        motor.ejecutarTurno(druida, nigromante);

        // 2. Personaje derrotado intenta atacar
        try { nigromante.recibirDanio(9999); } catch (AccionInvalidaException e) {}
        motor.ejecutarTurno(nigromante, druida);

        // 3. Arquero sin flechas
        Arquero sinFlechas = new Arquero("Legolas", 6, 150, "Arco Largo", 0, 95);
        motor.ejecutarTurno(sinFlechas, druida);

        // 4. Curar aliado derrotado
        System.out.println("\n-- Intento de curar aliado derrotado --");
        try {
            druida.curarAliado(nigromante); // Nigromante fue derrotado arriba
        } catch (RpgException e) {
            System.out.println("No se pudo curar: " + e.getMessage());
        }

        // 5. Daño negativo con finally
        System.out.println("\n-- Bloque manual try-catch-finally --");
        try {
            druida.recibirDanio(-50);
        } catch (AccionInvalidaException e) {
            System.out.println("Capturado: " + e.getMessage());
        } finally {
            System.out.println("El bloque finally siempre se ejecuta.");
        }

        motor.mostrarBitacora();

        
       

        GestionGremio gremio = new GestionGremio();
        
       
        gremio.agregarMiembro(new Druida("Sylva", 10, 300, 100, 50, "Oso"));
        gremio.agregarMiembro(new Nigromante("Malachar", 8, 250, 120, 10));
        gremio.agregarMiembro(new Arquero("Legolas", 6, 150, "Arco", 20, 95));
        gremio.agregarMiembro(new Guerrero("Thorin", 9, 400, "Hacha", 80));
        gremio.eliminarMiembro("Malachar");
        
       
        gremio.encolarSolicitante("Gandalf");
        gremio.encolarSolicitante("Aragorn");
        gremio.atenderSiguiente();
        
        
        gremio.agregarItem("Poción de vida", 5);
        gremio.agregarItem("Poción de vida", 3);
        gremio.usarItem("Pergamino de fuego");
        
        
        gremio.registrarHabilidad("Curación");
        gremio.registrarHabilidad("Curación"); // Intento duplicado
        
        
        gremio.mostrarRoster();
        gremio.mostrarCola();
        gremio.mostrarInventario();
        gremio.mostrarHabilidades();
    }
}